package java_gui.ELU_063;

// ELU-FInter/FInter.java

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Calc {
    boolean test(Double d);
}

@FunctionalInterface
interface Cons {
    void consume(Object ob);
}

public class FInter {
    public static void main (String[] args) {
        double mn = 0, mx = 10; // effectively final
        List<Calc> list = Arrays.asList(
                d -> d <  0,    // types inferred
                d -> d >= 0,
                d -> mn <= d && d <= mx
        );

        Cons cons = ob -> System.out.print(ob + " ");

        for (double d = -2; d < 15; d += 5) {
            for (Calc calc : list)
                cons.consume(calc.test(d));
            System.out.println();
        }
    }
}

