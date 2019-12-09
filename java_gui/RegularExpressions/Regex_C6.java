package java_gui;

import java.util.regex.Pattern;

// Case Sensitivity and Unicode Case
public class Regex_C6 {
    public static void main(String[] args) {
        String s = "PaRiS";
        boolean b1 = Pattern.compile(
                "paris").matcher(s).matches();
        boolean b2 = Pattern.compile(
                "paris", Pattern.CASE_INSENSITIVE)
                .matcher(s).matches();
        System.out.println("b1=" + b1 + "; b2=" + b2);
    }
}
