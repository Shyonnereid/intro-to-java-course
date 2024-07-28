package com.cbfacademy;

public class Paint {
    private double coverage; // number of square feet per gallon

    // Constructor to initialize the coverage
    public Paint(double coverage) {
        this.coverage = coverage;
    }

    // Method to calculate the amount of paint needed for a given shape
    public double getAmount(Shapes shape) {
        double area = shape.getArea();
        return area / coverage;
    }
}