package java_gui.BHE_014;

// BHE-StatEx/StatExample.java

public class StatExample {
    private static double rate = 1;
    private static char ID = 'A';

    private double amount;
    private char id;

    public static void setRate(double r) {
        rate = r;
    }

    public static double getRate() {
        return rate;
    }

    StatExample(double a) {
        id = ID++;
        amount = a;
    }

    public char getID() {
        return this.id;
    }


    @Override
    public String toString() {
        return "I'm " + id + ", I have $" + amount +
                " = " + rate * amount + " PLN";
    }

    public static void main(String[] args) {
        StatExample.setRate(4.1);
        StatExample sa = new StatExample(10);
        StatExample sb = new StatExample(16);
        StatExample sc = new StatExample(20);
        System.out.println(sc + "\n" + sb + "\n" + sa);
        System.out.println(sc.getID());
        System.out.println(sb.getID());
        System.out.println(sa.getID());
    }
}

