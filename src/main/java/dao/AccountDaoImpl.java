package dao;

import entities.Account;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;


public class AccountDaoImpl implements AccountDao {

    Logger logger = Logger.getLogger(AccountDaoImpl.class);

    @Override
    public void save(Account account) {
        logger.debug(account.toString());

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(account);
        transaction.commit();
        session.close();

    }

    @Override
    public void update(Account account) {
        logger.debug(account.toString());

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(account);
        transaction.commit();
        session.close();

    }

    @Override
    public Account getById(int id) {
        logger.debug(id);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Account.class).getReference(id);
    }


    @Override
    public void delete(Account account) {
        logger.debug(account.toString());

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(account);
        transaction.commit();
        session.close();

    }
}
