import java.util.*;

public class arr3 {
    public static void main(String[] args) {
        int[] marks = { 70, 80, 90 };

        marks[1] = 95;

        System.out.println(marks[1]);
        marks[3] = 99;

        System.out.println(Arrays.toString(marks));
    }
}
