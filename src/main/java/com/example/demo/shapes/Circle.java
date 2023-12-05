package com.example.demo.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape implements Cloneable {
    private int radix;
    public Circle(Color color, int Radix) {
        super(color);
        this.radix = Radix;
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(50, 50, radix*2, radix*2);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "Радиус=" + radix +
                '}';
    }

    @Override
    public Circle clone() {
        return (Circle) super.clone();
    }
}
