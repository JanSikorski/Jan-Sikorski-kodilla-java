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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.base, base) != 0) return false;
        return Double.compare(triangle.heigth, heigth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(base);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heigth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
