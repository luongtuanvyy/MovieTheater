package com.movie.dao;

import com.movie.utils.JDBCUtils;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AbstractDao<T> {

    public static final EntityManager entityManager = JDBCUtils.getEntityManager();

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() throws Throwable {
        entityManager.close();
        super.finalize();
    }

    public T findByID(Class<T> clazz, Integer id) {
        return entityManager.find(clazz, id);
    }

    public List<T> findAll(Class<T> clazz) {
        String name = clazz.getSimpleName();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT o FROM ").append(name).append(" o ");
        TypedQuery<T> query = entityManager.createQuery(sql.toString(), clazz);
        return query.getResultList();
    }

    public List<T> pageAble(Class<T> clazz, boolean isActive, int pageNumber, int pageSize) {
        String name = clazz.getSimpleName();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT o FROM ").append(name).append(" o ");
        if (isActive) {
            sql.append(" WHERE isActive = 1");
        }
        TypedQuery<T> query = entityManager.createQuery(sql.toString(), clazz);
        query.setFirstResult((pageNumber - 1) * pageSize);
        query.setMaxResults(pageSize);
        return query.getResultList();
    }

    public List<T> findByParams(Class<T> clazz, String sql, Object... params) {
        TypedQuery<T> query = entityManager.createQuery(sql, clazz);
        for (int i = 0; i < params.length; i++) {
            query.setParameter(i, params[i]);
        }
        return query.getResultList();
    }

    public T create(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            System.out.println("Create completed");
            return entity;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Cannot insert entity" + entity.getClass().getSimpleName());
            throw new RuntimeException(e);
        }
    }

    public T update(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
            System.out.println("Update completed");
            return entity;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Cannot update entity" + entity.getClass().getSimpleName());
            throw new RuntimeException(e);
        }
    }

    public void delete(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
            System.out.println("Delete completed");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Cannot delete entity" + entity.getClass().getSimpleName());
            throw new RuntimeException(e);
        }
    }

    protected T findOne(Class<T> movieClass, String title, String s) {
        return null;
    }

    protected List<T> findMany(Class<T> movieClass, String sql, String type) {
        return null;
    }
}
