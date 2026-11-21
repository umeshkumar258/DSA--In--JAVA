import java.util.*;

public class StrMethods {
    public static void main(String[] args) {

        String word = "Java";

        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.charAt(2));

        String newword = "Programming";

        System.out.println(newword.substring(0, 4));

        System.out.println(newword.indexOf('g'));

        String a = "Java";
        String b = "Java";

        System.out.println(a.equals(b));

        String name = "  Umesh  ";

        System.out.println(name.trim());
    }
}