package utils;

import entities.*;
import org.hibernate.Cache;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory != null) {
            return sessionFactory;
        }
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Client.class);
        configuration.addAnnotatedClass(Account.class);
        configuration.addAnnotatedClass(Status.class);
        configuration.addAnnotatedClass(Passport.class);
        configuration.addAnnotatedClass(Car.class);
        configuration.addAnnotatedClass(Role.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }
}
