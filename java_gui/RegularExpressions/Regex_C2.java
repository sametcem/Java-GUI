package java_gui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_C2 {
    public static void main(String[] args) {
        String reg = "\\s*(\\w+).*?(\\d+-(\\d+))";

        String text = " Einstein Albert, 1879-1955";
        Matcher m = Pattern.compile(reg).matcher(text);
        System.out.println("Matches? " + m.matches());
        System.out.println("# of groups " + m.groupCount());
        for (int i = 1; i <= m.groupCount(); ++i)
            System.out.println(i + ": " + m.group(i));
    }
}
