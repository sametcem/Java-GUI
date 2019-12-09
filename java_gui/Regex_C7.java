package java_gui;

import java.util.regex.Pattern;

// Unicode Character Class
public class Regex_C7 {
    public static void main(String[] args) {

        String s = "Zółc";
        boolean b1 = Pattern.compile(
                "\\w+").matcher(s).matches();
        boolean b2 = Pattern.compile(
                "\\w+", Pattern.UNICODE_CHARACTER_CLASS)
                .matcher(s).matches();
        System.out.println("b1=" + b1 + "; b2=" + b2);
    }
}
