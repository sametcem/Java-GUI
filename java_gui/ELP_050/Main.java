package java_gui.ELP_050;

// ELP-Comps2/Main.java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    Main() {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("K",1980,165));
        list.add(new Person("B",1986,171));
        list.add(new Person("K",1980,168));
        list.add(new Person("H",1980,171));
        list.add(new Person("M",1980,171));
        list.add(new Person("K",1980,169));
        list.add(new Person("B",1979,171));
        list.add(new Person("G",1975,171));

        // natural
        Collections.sort(list);
        writeL(list, "Natural: name, age, height");

        // comparator Comp1
        Collections.sort(list, new Comp1());
        writeL(list, "Comp1:   height, age, name");

        // comparator Comp2
        Comparator<Person> comp2 = new Comp2();
        Collections.sort(list, comp2);
        writeL(list, "Comp2:   age, name, height");

        // anonymous comparator
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p, Person q) {
                int k = p.name.compareToIgnoreCase(q.name);
                if ( k != 0 ) return k;
                k = p.height - q.height;
                if ( k != 0 ) return k;
                return q.birthYear - p.birthYear;
            }
        });
        writeL(list, "Anonym:  name, height, age");

        // lambda
        Collections.sort(list, (f,s) -> f.height-s.height);
        writeL(list, "Lambda:  name, height, age");
    }

    static void writeL(List<Person> list, String header) {
        System.out.println('\n'+header);
        for (Person p : list) System.out.print(p+" ");
        System.out.println();
    }
}

