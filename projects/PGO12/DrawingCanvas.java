package PGO12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawingCanvas extends JPanel {
    private ShapeFactory shapeFactory;
    private List<Shape> shapes;

    public DrawingCanvas(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
        this.shapes = new ArrayList<>();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Shape shape = shapeFactory.createShape(e.getX(), e.getY());
                shapes.add(shape);
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
