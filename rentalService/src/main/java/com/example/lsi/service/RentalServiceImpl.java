package com.example.lsi.service;

import org.springframework.stereotype.Service;

@Service
public class RentalServiceImpl implements RentalService{
    @Override
    public boolean rent(String plateNumber) throws CarNotFoundException {
        if(plateNumber == null) throw new CarNotFoundException(plateNumber);
        return false;
    }
}
