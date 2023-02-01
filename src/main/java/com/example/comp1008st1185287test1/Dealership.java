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


    public double getInventoryValue(){
        double total = 0.00;
        for (Car car: inventory) total += car.getPrice();
        return total;
    }

public <arraylist> getCarsNewerThan(){


}




    @Override
    public String toString() {
        return String.format("The dealerships entire inventory has %s a total price of $%.2f", + getInventoryValue());
    }



    }

