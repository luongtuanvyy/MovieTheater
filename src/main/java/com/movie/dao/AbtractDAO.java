package com.movie.dao;

import com.movie.utils.JDBCUtils;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AbtractDAO<T> {

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

    public List<T> findAll(Class<T> clazz, boolean isActive){
        String name = clazz.getSimpleName();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT o FROM ").append(name).append("o");
        if(isActive) {
            sql.append(" WHERE isActive = 1");
        }
        TypedQuery<T> query = entityManager.createQuery(sql.toString(),clazz);
        return query.getResultList();
    }

    public List<T> pageAble(Class<T> clazz, boolean isActive, int pageNumber, int pageSize){
        String name = clazz.getSimpleName();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT o FROM ").append(name).append("o");
        if(isActive) {
            sql.append(" WHERE isActive = 1");
        }
        TypedQuery<T> query = entityManager.createQuery(sql.toString(),clazz);
        query.setFirstResult((pageNumber -1) * pageSize);
        query.setMaxResults(pageSize);
        return query.getResultList();
    }



}
