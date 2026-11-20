import java.util.HashMap;

public class Useing_HashMap_char_frequency {
    public static void main(String[] args) {

        String str = "JAava Programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}