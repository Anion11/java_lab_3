package com.example.demo.Controller;

import com.example.demo.shapes.Shape;
import com.example.demo.shapes.Circle;
import com.example.demo.shapes.Triangle;
import com.example.demo.shapes.Rectangle;
import com.example.demo.shapes.Sqare;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class HelloController implements Initializable {
    public Canvas canvas;
    public ListView ListBox;
    public ColorPicker colorPicer;
    private ObservableList<Shape> content;

    @Override
    public void initialize() {
        Sqare square = new Sqare(Color.RED,50);
        Rectangle rectangle = new Rectangle(Color.RED,100, 50);
        Circle circle = new Circle(Color.RED,25);
        Triangle triangle = new Triangle(Color.RED,50);
        content = FXCollections.observableArrayList();
        content.add(square);
        content.add(rectangle);
        content.add(triangle);
        content.add(circle);
        ListBox.setItems(content);
        ListBox.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
    public void drawShape(MouseEvent mouseEvent) {
        int index = ListBox.getSelectionModel().getSelectedIndex();

        Shape shape = (Shape) content.get(index).clone();

        shape.setColor(colorPicer.getValue());

        shape.draw(canvas.getGraphicsContext2D());
    }
}