package java_gui.ELP_050;

// ELP-Comps2/Person.java

public class Person implements Comparable<Person> {

    final static int currentYear =
            java.util.Calendar.getInstance().
                    get(java.util.Calendar.YEAR);

    String name;
    int    birthYear;
    int    height;

    Person(String n, int y, int h) {
        name      = n;
        birthYear = y;
        height    = h;
    }

    /**
     * natural order: by name, then age, then height
     */
    @Override
    public int compareTo(Person o) {
        int k = name.compareToIgnoreCase(o.name);
        if ( k != 0 ) return k;
        k = o.birthYear - birthYear;
        if ( k != 0 ) return k;
        return height - o.height;
    }

    public String toString() {
        return name + "(" + (currentYear-birthYear) +
                "/" + height + ")";
    }
}
