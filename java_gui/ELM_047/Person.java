package java_gui.ELM_047;

// ELM-Comps1/Person.java

public class Person implements Comparable<Person> {

    private String name;
    private int    year;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Person other) {
        int diff = year - other.year;
        if (diff != 0) return diff;
        else           return name.compareTo(other.name);
    }

    public String getName() { return name; }
    public int getYear()    { return year; }

    @Override
    public String toString() {
        return name + "(" + year + ")";
    }

    static void show(Person[] persons, String message) {
        System.out.println(message);
        for (Person person : persons)
            System.out.print(person + " ");
        System.out.println("\n");
    }
}

