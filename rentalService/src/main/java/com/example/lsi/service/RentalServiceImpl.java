package com.example.lsi.service;

import org.springframework.stereotype.Service;
import com.example.lsi.data.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentalServiceImpl implements RentalService{

    List<Car> cars = new ArrayList<Car>();

    public RentalServiceImpl() {
        Car car = new Car("11AA22", 100, "Ferrari");
        cars.add(car);
        car = new Car("22BB33", 200, "Porsche");
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean rent(String plateNumber) throws CarNotFoundException {
        if(plateNumber == null) throw new CarNotFoundException(plateNumber);
        return false;
    }
}
