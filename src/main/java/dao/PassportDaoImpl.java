package dao;

import entities.Passport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class PassportDaoImpl implements PassportDao {
    @Override
    public void save(Passport passport) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(passport);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Passport passport) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(passport);
        transaction.commit();
        session.close();
    }

    @Override
    public Passport findId(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Passport.class).getReference(id);
    }


    @Override
    public void delete(Passport passport) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(passport);
        transaction.commit();
        session.close();
    }
}
