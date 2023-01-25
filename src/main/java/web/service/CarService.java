package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> viewCars(List<Car> cars, int count);

    public List<Car> getCars();
}
