package com.example.demo.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Triangle extends Shape implements Cloneable {
    public double x;
    public Triangle(Color color, int x) {
        super(color);
        this.x = x;
    }
    @Override
    public void draw(GraphicsContext gc) {
        double sideLength = x;
        double height = sideLength * Math.sqrt(3) / 2;
        double centerX = x + sideLength / 2;
        double topY = x - height / 2;

        double[] xPoints = {centerX, centerX - sideLength / 2, centerX + sideLength / 2};
        double[] yPoints = {topY, topY + height, topY + height};
        gc.setFill(color);
        gc.setStroke(color);
        gc.fillPolygon(xPoints, yPoints, 3);
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "Сторона=" + x +
                '}';
    }

    @Override
    public Triangle clone() {
        return (Triangle) super.clone();
    }
}
