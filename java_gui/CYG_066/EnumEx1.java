package java_gui.CYG_066;

// CYG-Enum1/EnumEx1.java

public class EnumEx1 {

    public enum Season {SPRING, SUMMER, FALL, WINTER};

    public static void main (String[] args) {
        Season[] seasons = Season.values();            //+1
        for (Season s : seasons)
            System.out.print(s + " ");                 //+2
        System.out.println();

        System.out.println(Season.WINTER + " is the " +
                (Season.WINTER.ordinal()+1) + "th season");//+3
        Season f = Season.valueOf("FALL");             //+4
        System.out.println("FALL is " + f + "...");
        System.out.println("Is f equal to FALL? " +
                (f == Season.FALL));     //+5
        for (Season s : seasons)
            System.out.print(german(s) + " ");
        System.out.println();
    }

    private static String german(Season s) {
        switch (s) {                                   //+6
            case SPRING: return "Fr\u00fchling";
            case SUMMER: return "Sommer";
            case FALL  : return "Herbst";
            case WINTER: return "Winter";
        }
        return "Cannot happen";
    }
}
