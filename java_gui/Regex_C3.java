package java_gui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_C3 {
    public static void main(String[] args) {

        /*
        String reg = "(['\"])[^'\"]*\\1";
        String text = "'abc' xx \"def\" yy \"ghi' zz";
        Matcher m = Pattern.compile(reg).matcher(text);
        while (m.find())
            System.out.println(m.group());
        */

        /*
        String orig = "John Smith, Mary Brown";
        String modif = orig.replaceAll(
                "(\\p{L}+)\\s+(\\p{L}+)", "$2 $1");
        System.out.println("Orig : " + orig + '\n' +
                "Modif: " + modif);

        //OR
        */

        String orig = "John Smith, Mary Brown";
        String modif = orig.replaceAll(
                "(?<first>\\p{L}+)\\s+(?<last>\\p{L}+)",
                "${last} ${first}");
        System.out.println("Orig : " + orig + '\n' +
                "Modif: " + modif);

    }
}
