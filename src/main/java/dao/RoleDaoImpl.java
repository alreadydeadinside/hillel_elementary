package dao;

import entities.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class RoleDaoImpl implements RoleDao {
    @Override
    public void save(Role role) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(role);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Role role) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(role);
        transaction.commit();
        session.close();
    }

    @Override
    public Role findId(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Role.class).getReference(id);
    }


    @Override
    public void delete(Role role) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(role);
        transaction.commit();
        session.close();
    }
}
