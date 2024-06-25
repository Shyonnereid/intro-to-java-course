package com.cbfacademy.cars;

public class Car {
    // Instance variables 
    private String make;
    private String model;
    private String colour;
    private int year
    ;

    // Constructor
    public Car(String make, String model, String colour, int year){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    // Getter for make
    public String getMake() {
        return this.make;
    }

    // Getter for model
    public String getModel() {
        return this.model;
    }

     // Getter for colour
     public String getColour() {
        return this.colour;
    }

    // Getter for year
    public int getYear() {
        return this.year;
    }

    // Setter for colour
    public void setColour(String colour) {
        this.colour = colour;
    }

    // Method to get the details of the car
    public String getDetails() {
        return this.make + " " + this.model + " " + this.colour + " " + this.year;
    }

}

