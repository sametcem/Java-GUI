package java_gui.BG0_007;

// BGO-TrivPoint/TrivPoint.java

public class TrivPoint {
    public int x, y;

    public void translate(int dx,int dy) {
        x += dx;
        y += dy;
    }

    public void scale(int sx,int sy) {
        x *= sx;
        y *= sy;
    }

    // static!!!
    public static void infoStatic(TrivPoint p) {
        System.out.println("[" + p.x + "," + p.y + "]");
    }

    public void info() {
        System.out.println("[" + this.x + "," + y + "]");
    }
}

