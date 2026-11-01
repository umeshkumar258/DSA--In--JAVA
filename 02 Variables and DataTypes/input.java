
import java.util.*;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter byte:");
        byte a = sc.nextByte();

        System.out.println("Enter short:");
        short b = sc.nextShort();

        System.out.println("Enter char:");
        char c = sc.next().charAt(0);

        System.out.println("Enter int:");
        int d = sc.nextInt();

        System.out.println("Enter long:");
        long e = sc.nextLong();

        System.out.println("Enter float:");
        float f = sc.nextFloat();

        System.out.println("Enter double:");
        double g = sc.nextDouble();

        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        System.out.println("Character: " + c);
        System.out.println("String: " + s);

        sc.close();
    }
}
