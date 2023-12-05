package com.example.demo.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected Color color;
    protected double x, y;
    public Shape(Color color) {
        this.color = color;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    public abstract void draw(GraphicsContext gr);
    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}