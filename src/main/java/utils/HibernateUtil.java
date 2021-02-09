package utils;

import entities.Account;
import entities.Client;
import entities.Status;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        Logger logger = Logger.getLogger(HibernateUtil.class);

        if (sessionFactory != null) {
            return sessionFactory;
        }
        try {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(Client.class);
            configuration.addAnnotatedClass(Account.class);
            configuration.addAnnotatedClass(Status.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
        } catch (Exception e) {
            logger.error("ERROR", e);
        }
        return sessionFactory;
    }
}
