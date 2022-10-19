package com.kodilla.testing.shape;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new LinkedList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }
    public String getFigure(int n) {
        return shapes.get(n).getShapeName();
    }
    public String showFigures() {
        String figures = "";
        for (int i = 0; i < shapes.size(); i++) {
            figures += shapes.get(i).toString();
            if (i < shapes.size()-1) {
                figures += "\n";
            }
        }
        return figures;
    }
}
