package java_gui.ELM_047;

// ELM-Comps1/CompPerson.java

import java.util.Comparator;

public class CompPerson implements Comparator<Person> {

    public static enum Comp { BY_NAME,    BY_YEAR,
        BY_NAMERev, BY_YEARRev };
    private Comp comp;

    public CompPerson(Comp comp) {
        this.comp = comp;
    }

    @Override
    public int compare(Person p1, Person p2) {

        int rYear = p1.getYear() - p2.getYear();
        int rName = p1.getName().compareTo(p2.getName());

        int result = 0;

        switch (comp) {
            case BY_NAME:
                result = rName != 0 ?  rName : rYear; break;
            case BY_NAMERev:
                result = rName != 0 ? -rName : rYear; break;
            case BY_YEAR:
                result = rYear != 0 ?  rYear : rName; break;
            case BY_YEARRev:
                result = rYear != 0 ? -rYear : rName; break;
        }
        return result;
    }
}

