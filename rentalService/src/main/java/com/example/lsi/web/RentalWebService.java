package com.example.lsi.web;

import com.example.lsi.service.RentalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalWebService {

    RentalService rentalService;
    Logger logger = LoggerFactory.getLogger(RentalWebService.class);

    @Autowired
    public RentalWebService(RentalService rentalService){
        this.rentalService = rentalService;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello !";
    }

    @PutMapping("/cars/{plaque}")
    public void rent(@PathVariable("plaque") String plateNumber){
        logger.info("PlateNumber: "+ plateNumber);
        rentalService.rent(plateNumber);
    }
}
