package dao;

import entities.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class CarDaoImpl implements CarDao {
    @Override
    public void save(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(car);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(car);
        transaction.commit();
        session.close();
    }

    @Override
    public Car findId(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Car.class).getReference(id);
    }


    @Override
    public void delete(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(car);
        transaction.commit();
        session.close();
    }
}
