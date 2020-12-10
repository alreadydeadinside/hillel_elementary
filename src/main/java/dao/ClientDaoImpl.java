package dao;

import entities.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.Hibernate;

public class ClientDaoImpl implements ClientDao {

    @Override
    public void save(Client client) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(client);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Client client) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(client);
        transaction.commit();
        session.close();
    }

    @Override
    public Client findUser(int id) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session
                .byId(Client.class)
                .getReference(id);
    }


    @Override
    public void delete(Client client) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(client);
        transaction.commit();
        session.close();
    }

    @Override
    public Client getByPhone(long phone) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session
                .byNaturalId(Client.class)
                .using("phone", phone)
                .load();
    }
}
