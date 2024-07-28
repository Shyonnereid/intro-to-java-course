package com.cbfacademy;

public class Sphere extends Shapes {
    private double radius;

    // Constructor to initialize the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Overriding the getArea method to calculate the surface area of the sphere
    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Overriding the getName method to return the name of the shape
    @Override
    public String getName() {
        return "Sphere";
    }
}