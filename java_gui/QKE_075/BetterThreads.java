package java_gui.QKE_075;

// QKE-BetterThreads/BetterThreads.java

public class BetterThreads extends Thread {

    private long number = 0L;

    public static void main(String[] args) {
        new BetterThreads().start();
    }

    public BetterThreads() {
        final int MAXNUM = 40;
        for (int i = 0; i < MAXNUM; ++i)
            new Thread(new MyRunner(this),""+i).start();
        System.out.println(MAXNUM + " THREADS STARTED");
    }

    public long getNumber() {
        if (number < 1) number = number + 1;
        number = number - 1;
        return number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ignored) { }
        System.out.println("Killing program");
        System.exit(0);
    }
}

class MyRunner implements Runnable {
    private final BetterThreads better;

    public MyRunner(BetterThreads better) {
        this.better = better;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        long n;
        while (true) {
            synchronized(better) {
                n = better.getNumber();
            }
            if (n != 0) {
                System.out.println(
                        "n = " + n + " in thread " + name);
                break;
            }
        }
    }
}

