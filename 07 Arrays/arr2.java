import java.util.*;

public class arr2 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30,80 };

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);

        for(int i  = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // For each loop
        /* i know that one.. */
        for(int num:numbers){
            System.out.println(num);
        }
    }
}
