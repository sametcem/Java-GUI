package java_gui.ELM_047;

// ELM-Comps1/Main.java

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Mary",1990),
                new Person("Joan",1992),
                new Person("Suzy",1992),
                new Person("Beth",1992),
                new Person("Suzy",1980),
                new Person("Katy",1982),
        };
        Person.show(persons,"At the beginning:");

        Arrays.sort(persons);
        Person.show(persons,"Natural order: " +
                "by year, then by name");

        Arrays.sort(persons,
                new CompPerson(CompPerson.Comp.BY_NAME));
        Person.show(persons,"Order BY_NAME: " +
                "by name, then by year");

        Arrays.sort(persons,
                new CompPerson(CompPerson.Comp.BY_NAMERev));
        Person.show(persons,"Order BY_NAMERev: " +
                "by name reversed, then by year");

        Arrays.sort(persons,
                new CompPerson(CompPerson.Comp.BY_YEAR));
        Person.show(persons,"Order BY_YEAR: " +
                "by year, then by name");

        Arrays.sort(persons,
                new CompPerson(CompPerson.Comp.BY_YEARRev));
        Person.show(persons,"Order BY_YEARRev: " +
                "by year reversed, then by name");

        Arrays.sort(persons,
                (f,s) -> s.getYear() - f.getYear());
        Person.show(persons,"Order by lambda : " +
                "by year ");
    }
}

