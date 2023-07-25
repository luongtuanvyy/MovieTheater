package com.movie.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JDBCUtils {
    private static EntityManagerFactory factory ;

    public static EntityManager getEntityManager(){
        if(factory == null || factory.isOpen()){
            factory = Persistence.createEntityManagerFactory("movie");
        }
        return factory.createEntityManager();
    }

    public static void closeEntityManager(){
        if(factory != null && factory.isOpen()){
            factory.close();
        }
    }
}
