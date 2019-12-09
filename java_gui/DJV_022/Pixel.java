package java_gui.DJV_022;

// DJV-Inherit/Pixel.java

import java.awt.Color;

public class Pixel extends Point {

    private Color color;

    public Pixel(int x, int y, Color color) {
        super(x,y);
        this.color = color;
    }

    public Pixel(int x, int y) {
        this(x,y,Color.BLACK);
    }

    public Pixel(Color color) {
        this(0,0,color);
    }

    public Pixel() {
        this(0,0,Color.BLACK);
    }

    @Override
    public String toString() {
        return super.toString() + "(r=" + color.getRed() +
                ",g=" + color.getGreen() + ",b=" +
                color.getBlue() + ")";
    }
}

