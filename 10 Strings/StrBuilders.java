import java.util.*;

public class StrBuilders {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println(sb);

        for (int i = 0; i < 4; i++) {
            sb.append(i);
        }

        System.out.println(sb);

        sb.append(" DSA");
        System.out.println(sb);

        sb.insert(4, " +");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
