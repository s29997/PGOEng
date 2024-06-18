package PGO12;

import java.awt.Color;
import java.awt.Graphics;

public class RectangleShape extends Shape {
    private int width;
    private int height;

    public RectangleShape(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
