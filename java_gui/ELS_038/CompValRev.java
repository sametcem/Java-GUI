package java_gui.ELS_038;

// ELS-DefIntSimple/CompValRev.java

public class CompValRev implements MyCompar {
    @Override
    public boolean lt(int lhs, int rhs) {
        return lhs > rhs;
    }
}

