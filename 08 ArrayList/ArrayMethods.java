import java.util.ArrayList;

public class ArrayMethods {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(8);
        numbers.add(9);
        numbers.add(999);

        System.out.println(numbers);        // Output: [8, 9]
        System.out.println(numbers.get(1)); // Output: 9

        numbers.remove(1);

        System.out.println(numbers);

        numbers.set(1,99);

        System.out.println(numbers);

        System.out.println(numbers.size());;

        System.out.println(numbers.contains(7));
    }
}