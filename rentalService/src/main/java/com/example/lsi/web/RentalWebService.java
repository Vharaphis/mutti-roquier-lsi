package com.example.lsi.web;

import com.example.lsi.data.Dates;
import com.example.lsi.service.RentalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
public class RentalWebService {

    RentalService rentalService;
    Logger logger = LoggerFactory.getLogger(RentalWebService.class);

    @Autowired
    public RentalWebService(RentalService rentalService){
        this.rentalService = rentalService;
        logger.info("rentalService: " +rentalService);
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello !";
    }

    @PutMapping("/cars/{plaque}")
    public void rent(@PathVariable("plaque") String plateNumber, 
                     @RequestBody Dates dates) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        simpleDateFormat.parse(dates.getBegin());
        simpleDateFormat.parse(dates.getEnd());

        logger.info("PlateNumber: "+ plateNumber);
        rentalService.rent(plateNumber);
    }
}
