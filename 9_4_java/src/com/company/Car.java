package com.company;

public class Car {
    private String brand;
    private String type;
    private String color;
    private String engine;
    private double price;
    private String CarId;
    private Chelun chelun;
    Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", price=" + price +
                ", CarId='" + CarId + '\'' +
                ", chelun=" + chelun +
                '}';
    }
}
