package dao;

import entities.Status;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.Hibernate;

public class StatusDaoImpl implements StatusDao {

    @Override
    public void save(Status status) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(status);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Status status) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(status);
        transaction.commit();
        session.close();
    }

    @Override
    public Status findUser(int id) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Status.class).getReference(id);
    }


    @Override
    public void delete(Status status) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(status);
        transaction.commit();
        session.close();
    }
}
