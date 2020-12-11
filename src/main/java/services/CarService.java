package services;

import entities.Car;

public interface CarService {

    void save(Car car);

    void update(Car car);

    Car getById(int id);

    void delete(Car car);
}
