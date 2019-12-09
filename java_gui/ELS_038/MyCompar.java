package java_gui.ELS_038;

// ELS-DefIntSimple/MyCompar.java

public interface MyCompar {
    // abstract
    boolean lt(int lhs, int rhs);

    // implemented directly in terms of the abstract
    default boolean gt(int lhs, int rhs) {
        return lt(rhs,lhs);
    }
    default boolean ge(int lhs, int rhs) {
        return !lt(lhs,rhs);
    }
    default boolean le(int lhs, int rhs) {
        return !lt(rhs,lhs);
    }
    default boolean eq(int lhs, int rhs) {
        return !lt(lhs,rhs) && !lt(rhs,lhs);
    }
    // implemented indirectly in terms of the abstract
    default boolean ne(int lhs, int rhs) {
        return !eq(lhs,rhs);
    }
}

