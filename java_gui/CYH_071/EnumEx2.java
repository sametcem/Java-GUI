package java_gui.CYH_071;

// CYH-EnumMet/EnumEx2.java

public class EnumEx2 {

    enum Season {
        SPRING {                                   //+1
            @Override
            public String toString() {return "Printemps";}
        },
        SUMMER {
            @Override
            public String toString() {
                return "\u00c9t\u00e9";
            }
        },
        FALL {
            @Override
            public String toString() {return "Automne";}
        },
        WINTER {
            @Override
            public String toString() {return "Hiver";}
        }
    };

    public static void main (String[] args) {
        Season[] seasons = Season.values();
        for (Season s : seasons)
            System.out.print(s + " ");         //+2
        System.out.println();
        for (Season s : seasons)
            System.out.print(s.name() + " ");  //+3
        System.out.println();
    }
}

