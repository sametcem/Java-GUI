package java_gui.QKG_078;

// QKG-Coord/Coord.java

class Texts {
    private String txt = null;
    private boolean newTxt = false;

    // invoked by Author to set a new text
    synchronized public void setText(String s) {
        while (newTxt) { // not if!!!
            try {
                wait();
            } catch(InterruptedException exc) {}
        }
        txt = s;
        newTxt = true;
        notify(); // invoked on 'this'
    }

    // invoked by Writer to get a text
    synchronized public String getText() {
        while (!newTxt) { // not if!!!
            try {
                wait(); // invoked on 'this'
            } catch(InterruptedException exc) {}
        }
        newTxt = false;
        notify();
        return txt;
    }
}

class Writer extends Thread {
    private Texts txtArea;
    public Writer(Texts t) {
        txtArea=t;
    }

    public void run() {
        String txt = null;
        while ((txt = txtArea.getText()) != null) {
            System.out.println("-> " + txt);
        }
    }
}

class Author extends Thread {
    private Texts txtArea;
    public Author(Texts t)  {
        txtArea=t;
    }

    public void run() {
        String[] texts = { "Dog", "Cat", "Zebra", "Lion",
                "Sheep", "Elephant", null };
        for (int i=0; i<texts.length; i++) {
            try {
                // writing a new text takes some time...
                sleep((int)(600 + Math.random()*300));
            } catch(InterruptedException ignored) { }
            txtArea.setText(texts[i]);
        }
    }
}

public class Coord {
    public static void main(String[] args) {
        Texts t   = new Texts();
        Thread t1 = new Author(t);
        Thread t2 = new Writer(t);
        t1.start();
        t2.start();
    }
}
