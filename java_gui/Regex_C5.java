package java_gui;

import java.util.regex.Pattern;

//Dotall
public class Regex_C5 {
    public static void main(String[] args) {
        String s = "A 123\n456 B";
        boolean b1 = Pattern.compile(
                "\\w.*\\w").matcher(s).matches();
        boolean b2 = Pattern.compile(
                "(?s)\\w.*\\w").matcher(s).matches();
        System.out.println("b1=" + b1 + "; b2=" + b2);
    }
}
