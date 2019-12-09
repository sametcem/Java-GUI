package java_gui.ELP_050;

// ELP-Comps2/Comparators.java

import java.util.Comparator;

// package classes (not public)

/**
 * Comparator 1: by height, then age , then name
 */
class Comp1 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int k = o1.height - o2.height;
        if ( k != 0 ) return k;
        k = o2.birthYear - o1.birthYear;
        if ( k != 0 ) return k;
        return o1.name.compareToIgnoreCase(o2.name);
    }
}

/**
 * Comparator 2: by age, then by name, then by height
 */
class Comp2 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int k = o2.birthYear - o1.birthYear;
        if ( k != 0 ) return k;
        k = o1.name.compareToIgnoreCase(o2.name);
        if ( k != 0 ) return k;
        return o1.height-o2.height;
    }
}
