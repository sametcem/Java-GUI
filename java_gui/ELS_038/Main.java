package java_gui.ELS_038;

// ELS-DefIntSimple/Main.java

public class Main {
    public static void main (String[] args) {

        MyCompar cmpVal = new CompVal();
        MyCompar cmpSum = new CompDigits();
        MyCompar cmpVaR = new CompValRev();

        compare("cmpVal - BY VALUE",cmpVal,
                10,2, 3,12, 5,22);
        compare("cmpSum - BY SUM OF DIGITS",cmpSum,
                10,2, 3,12, 5,22);
        compare("cmpVaR - BY VALUE REVERSED",cmpVaR,
                10,2, 3,12, 5,22);
    }

    private static void compare(String message,
                                MyCompar cmp, int... pairs) {
        System.out.println("\n========= " + message);
        for (int k = 0; k < pairs.length; k += 2) {
            int a = pairs[k], b = pairs[k+1];
            System.out.println("** (" + a + "," + b + "): "+
                    "lt->" + cmp.lt(a,b) + ", " +
                    "le->" + cmp.le(a,b) + "\n" +
                    "    gt->" + cmp.gt(a,b) + ", " +
                    "ge->" + cmp.ge(a,b) + ", " +
                    "eq->" + cmp.eq(a,b) + ", " +
                    "ne->" + cmp.ne(a,b) );
        }
    }
}

