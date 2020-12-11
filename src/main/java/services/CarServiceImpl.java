package services;

import dao.CarDao;
import dao.CarDaoImpl;
import entities.Car;

public class CarServiceImpl implements CarService {
    @Override
    public void save(Car car) {
        CarDao carDao = new CarDaoImpl();
        carDao.save(car);
    }

    @Override
    public void update(Car car) {
        if (car == null) {
            System.out.println("client is empty");
            return;
        }

        CarDao carDao = new CarDaoImpl();
        carDao.update(car);
    }

    @Override
    public Car findId(int id) {
        CarDao carDao = new CarDaoImpl();
        return carDao.findId(id);
    }

    @Override
    public void delete(Car car) {
        if (car == null) {
            System.out.println("client is empty");
            return;
        }

        CarDao carDao = new CarDaoImpl();
        carDao.delete(car);
    }
}
