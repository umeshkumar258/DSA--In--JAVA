
public class typeconversion {
    public static void main(String[] args) {

        byte a = 33;
        short b = a;
        int c = b;
        float d = c;
        long e = (long) d;
        double f = e;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("float: " + d);
        System.out.println("long: " + e);
        System.out.println("double: " + f);


        float z = 33.32f;

        int y = (int) z;

        System.out.println(y);

        char g = 'a';

        int num = g;

        System.out.println(num);
    }
}
