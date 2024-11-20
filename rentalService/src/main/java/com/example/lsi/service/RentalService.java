package com.example.lsi.service;

import com.example.lsi.data.Car;

import java.util.List;

public interface RentalService {

    public boolean rent(String plateNumber) throws CarNotFoundException;

    public List<Car> getCars();

    public void setCars(List<Car> cars);

}
