package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double base;
    private double heigth;

    public Triangle(double base, double heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getField() {
        return (base * heigth) / 2;
    }

    @Override
    public String toString() {
        return "Triangle(" + base + ", " + heigth + ")";
    }
}
