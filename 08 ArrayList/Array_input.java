import java.util.ArrayList;
import java.util.Scanner;

public class Array_input {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> numbers = new ArrayList<>();

        System.out.println("Enter the Number of ArrayList...");

        for(int i = 0;i<5;i++){

            int num = sc.nextInt();
            numbers.add(num);
        }

        System.out.println(numbers);
    }
    
}
