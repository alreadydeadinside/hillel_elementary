package dao;

import entities.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.Hibernate;

public class AccountDaoImpl implements AccountDao {

    @Override
    public void save(Account account) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(account);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Account account) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(account);
        transaction.commit();
        session.close();
    }

    @Override
    public Account findUser(int id) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Account.class).getReference(id);
    }


    @Override
    public void delete(Account account) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(account);
        transaction.commit();
        session.close();
    }
}
