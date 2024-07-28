package com.cbfacademy;

public class Rectangle extends Shapes {
    private double length;
    private double width;

     // Constructor to initialize the length and width
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    // Overriding the getArea method to calculate the area of the rectangle
    @Override
    public double getArea() {
        return length * width; 
    }

    // Overriding the getName method to return the name of the shape
    @Override
    public String getName(){
        return "Rectangle";
    }
}
