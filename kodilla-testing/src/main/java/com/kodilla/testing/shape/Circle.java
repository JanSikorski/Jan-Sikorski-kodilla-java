package com.kodilla.testing.shape;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getField() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle(" + radius + ")";
    }
}
