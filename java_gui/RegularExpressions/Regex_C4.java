package java_gui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Multiline
public class Regex_C4 {
    public static void main(String[] args) {

        String s = "A 123\nD 456";
        Matcher m1 = Pattern.compile("^\\w").matcher(s);
        Matcher m2 = Pattern.compile("(?m)^\\w").matcher(s);
        System.out.print("m1 : ");
        while (m1.find())
            System.out.print(m1.group() + " ");
        System.out.print("\nm2 : ");
        while (m2.find())
            System.out.print(m2.group() + " ");
        System.out.println();
    }
}
