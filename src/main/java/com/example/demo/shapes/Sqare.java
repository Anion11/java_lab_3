package com.example.demo.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Sqare extends Shape implements Cloneable {
    private int x;
    public Sqare(Color color, int x) {
        super(color);
        this.x = x;
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(2.0);
        gc.setFill(color);
        gc.setStroke(color);
        gc.fillRect(x, x, x, x);
    }
    @Override
    public String toString() {
        return "Sqare{" +
                "Сторона=" + x +
                '}';
    }

    @Override
    public Sqare clone() {
        return (Sqare) super.clone();
    }
}
