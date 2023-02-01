package com.example.comp1008st1185287test1;

import java.util.ArrayList;

public class Dealership {

private ArrayList<Car> inventory;


    public Dealership(){
        inventory = new ArrayList<Car>();
    }
        public void addCar(Car car){
            inventory.add(car);
        }

        public void removeCar(Car car){
        inventory.remove(car);
        }



    }

