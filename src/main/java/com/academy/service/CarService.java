package com.academy.service;

import com.academy.model.entity.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    public List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        Car car = new Car("BMW", 2009, null);
        Car car1 = new Car("Mercedes-Benz", 2002, null);
        Car car2 = new Car("Mazda", 2007, null);

        cars.add(car);
        cars.add(car1);
        cars.add(car2);


        return cars;
    }
}
