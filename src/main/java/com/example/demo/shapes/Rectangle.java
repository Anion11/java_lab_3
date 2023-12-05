package com.example.demo.shapes;

import com.example.demo.shapes.Shape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape implements Cloneable {
    double length;
    double width;
    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(2.0);
        gc.setFill(color);
        gc.setStroke(color);
        gc.fillRect(50, 50, length, width);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "Длина=" + length +
                ", Ширина=" + width +
                '}';
    }

    @Override
    public Rectangle clone() {
        return (Rectangle) super.clone();
    }
}
