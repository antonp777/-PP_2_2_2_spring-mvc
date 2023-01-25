package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "BMW", "520i"));
        cars.add(new Car(++CAR_COUNT, "TOYOTA", "CAMRY"));
        cars.add(new Car(++CAR_COUNT, "MERSEDES_BENZ", "CLS"));
        cars.add(new Car(++CAR_COUNT, "AUDI", "A6"));
        cars.add(new Car(++CAR_COUNT, "VOLKSWAGEN", "PASSAT"));
    }

    @Override
    public List<Car> viewCars(List<Car> cars, int count) {
        if (count < 5) {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
        return cars;
    }
    @Override
    public List<Car> getCars() {
        return cars;
    }
}
