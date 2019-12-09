package java_gui.QJS_077;

// QJS-RunThreads/RunThreads.java

public class RunThreads {
    public static void main (String[] args) {
        // ShowTime extends Thread
        Thread tTime = new ShowTime();

        // ShowLett implements Runnable
        Thread tLett = new Thread(new ShowLett());

        // object of anonymous class extending Thread
        Thread tNumb = new Thread() {
            @Override
            public void run() {
                int num = 0;
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch(InterruptedException exc) {
                        System.out.println(
                                " |\nNumb interrupted.");
                        return;
                    }
                    System.out.printf(" | N %d", ++num);
                }
            }
        };

        // object of anonymous class extending Thread;
        // using a lambda (as Runnable is functional)
        Thread tHebr = new Thread( () -> {
            int lett = 0x5D0-1;
            while (true) {
                try {
                    Thread.sleep(1750);
                } catch(InterruptedException exc) {
                    System.out.println(
                            " |\nHebr interrupted.");
                    return;
                }
                int c =  0x5D0 + (++lett-0x5D0)%27;
                System.out.printf(" | H %c", (char)c);
            }
        });

        tTime.start();
        tLett.start();
        tNumb.start();
        tHebr.start();
        try {
            Thread.sleep(10*1000);

            tTime.interrupt(); Thread.sleep(3*1000);
            tLett.interrupt(); Thread.sleep(4*1000);
            tNumb.interrupt(); Thread.sleep(3* 200);
            tHebr.interrupt(); Thread.sleep(   200);
        } catch (InterruptedException e) {
            System.out.println("Should never happen!!!");
            System.exit(1);
        }
        System.out.println("ALL DONE");
    }
}

class ShowTime extends Thread {
    @Override
    public void run() {
        int time = 0;
        while (true) {
            try {
                Thread.sleep(1500);
            } catch(InterruptedException exc) {
                System.out.println(" |\nTime interrupted.");
                return;
            }
            int min = ++time/60;
            int sec = time%60;
            System.out.printf(" | T %02d:%02d",min,sec);
        }
    }
}

class ShowLett implements Runnable {
    @Override
    public void run() {
        int lett = 'A'-1;
        while (true) {
            try {
                Thread.sleep(1250);
            } catch(InterruptedException exc) {
                System.out.println(" |\nLett interrupted.");
                return;
            }
            int c =  'A' + (++lett-'A')%26;
            System.out.printf(" | L %c", (char)c);
        }
    }
}

