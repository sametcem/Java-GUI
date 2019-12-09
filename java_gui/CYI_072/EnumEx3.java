package java_gui.CYI_072;

// CYI-EnumAbs/EnumEx3.java

public class EnumEx3 {
    enum Season {
        SPRING("nice",2) {                           //+1
            @Override                                //+2
            public String getDesc() {
                return name() + ": " + desc;
            }
        },
        SUMMER("hot",3) {
            @Override
            public String getDesc() {
                return desc + " in " + name();
            }
        },
        FALL("so, so",4) {
            @Override
            public String getDesc() {
                return name() + "? Well, " + desc;
            }
        },
        WINTER("cold",3) {
            @Override
            public String getDesc() {
                return name() + "! very " + desc;
            }
        }; // <-- semicolon after the last value!

        // fields and constructors are private anyway
        String     desc;                             //+3
        int numOfMonths;
        Season(String d, int i) {                    //+4
            desc        = d;
            numOfMonths = i;
        }

        public int getNumb() { return numOfMonths; } //+5
        public abstract String getDesc();            //+6
    };

    public static void main (String[] args) {
        for (Season s : Season.values())
            System.out.println(s.getNumb() +
                    " months - " + s.getDesc());
    }
}
