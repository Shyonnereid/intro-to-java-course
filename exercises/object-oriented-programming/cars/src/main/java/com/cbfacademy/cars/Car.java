package com.cbfacademy.cars;

public class Car {
    // Instance variables 
    private String make;
    private String model;
    private String colour;
    private int year
    ;

    // Constructor
    public Car(String make, String model, int year, String colour){
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    
    }

    // Getter for make
    public String getMake() {
        return this.make;
    }

    // Getter for model
    public String getModel() {
        return this.model;
    }

    // Getter for year
    public int getYear() {
        return this.year;
    }

     // Getter for colour
     public String getColour() {
        return this.colour;
    }   

    // Setter for colour
    public void setColour(String colour) {
        this.colour = colour;
    }

    // Method to get the details of the car
    public String getDetails() {
        return this.make + " " + this.model + " " + this.year + " " + this.colour;
    }


    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "V40", 2012, "blue");
        Car car2 = new Car("Porsche", "Panamera", 2009, "red");
        Car car3 = new Car("Audi", "A3", 2018, "grey");

        System.out.println(car1.getDetails());
        System.out.println(car2.getDetails());
        System.out.println(car3.getDetails());
    }

   
}

        


