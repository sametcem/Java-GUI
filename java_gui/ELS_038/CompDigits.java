package java_gui.ELS_038;

// ELS-DefIntSimple/CompDigits.java

public class CompDigits implements MyCompar {
    @Override
    public boolean lt(int lhs, int rhs) {
        return sumOfDigs(lhs) < sumOfDigs(rhs);
    }
    private static int sumOfDigs(int n) {
        int sum = 0;
        n = n < 0 ? -n : n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

