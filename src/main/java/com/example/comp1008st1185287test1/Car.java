package com.example.comp1008st1185287test1;

import java.util.Arrays;
import java.util.List;

public class Car {

    private String make;

    private String model;

    private double price;

    private int year;


    public void setMake(String make) {

        List<String> validMakes = Arrays.asList("Ford","GMC","Honda","Nissan","BMW");

        if (validMakes.contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException(make + "was not in the list of" + validMakes);

        this.make = make;
    }


    public void setModel(String model) {
        if (model.length() >= 2)
            this.model = model;
        else
            throw new IllegalArgumentException("This is Not a Valid Model in our Database");
    }


    public void setPrice(double price) {
        if (price >= 0 && price <= 150000)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be between 0 and 150,000 dollars");
    }


    public void setYear(int year) {
        if (year >= 1900 && year <= 2023)
        this.year = year;
        else
         throw new IllegalArgumentException("Not a valid year in our system");
    }

    public Car(String make, String model, double price, int year) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String toString() {
        return String.format("%s-%s, price: $%.2f",make, model, price, year);
    }




}
