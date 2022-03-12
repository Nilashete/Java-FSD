package com.ecommerce;

import java.sql.DatabaseMetaData;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

    static {
            try {
                    StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                                    .configure("hibernate.cfg.xml").build();
                    DatabaseMetaData metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                    sessionFactory = metaData.getSessionFactoryBuilder().build();
            } catch (Throwable th) {
                    throw new ExceptionInInitializerError(th);
            }
    }

    public static SessionFactory getSessionFactory() {
            return sessionFactory;
    }

}
