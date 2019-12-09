package java_gui.BG0_007;

// BGO-TrivPoint/Main.java

public class Main {
    public static void main(String[] args) {
        TrivPoint p = new TrivPoint();
        p.x = 1;
        p.y = 2;
        p.info();
        TrivPoint.infoStatic(p);
        p.infoStatic(p);        // not recommended

        p.scale(2,3);
        p.info();
        p.translate(1,-3);
        p.info();
    }
}

