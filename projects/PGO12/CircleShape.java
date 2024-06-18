package PGO12;

import java.awt.Color;
import java.awt.Graphics;

public class CircleShape extends Shape {
    private int radius;

    public CircleShape(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
