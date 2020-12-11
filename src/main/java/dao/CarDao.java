package dao;

import entities.Car;

public interface CarDao {

    void save(Car car);

    void update(Car car);

    Car getById(int id);

    void delete(Car car);
}
