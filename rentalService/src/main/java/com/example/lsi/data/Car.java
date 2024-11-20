package com.example.lsi.data;

public class Car {

    String plateNumber;
    int price;
    String brand;

    public Car(String plateNumber, int price, String brand) {
        this.plateNumber = plateNumber;
        this.price = price;
        this.brand = brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
