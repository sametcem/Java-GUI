package java_gui;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Regex_C1 {
    public static void main(String[] args) {
        /*
        String s = "Łódz - 0.7; London - 8.8; Tokyo - 13.6";
        String reg = "\\P{Lu}+";

        String [] res = s.split(reg);
        for(String a : res) {
            System.out.println(a + " ");
        }
        */

        String ben = "cat, caterpillar, tomcat, cat";
        String reg = "\\bcat\\b";

        System.out.println(ben.replaceAll(reg,"dog"));
    }
}
