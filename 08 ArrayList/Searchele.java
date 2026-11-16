import java.util.ArrayList;
import java.util.Scanner;

public class Searchele {
    public static void main(String[] args) {
        
        ArrayList <Integer> numbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of ArrayList...");

        for(int i = 0;i<5;i++){

            int num = sc.nextInt();
            numbers.add(num);
        }

        System.out.println("Enter the ele to search..");

        int search = sc.nextInt();

        for(int i = 0;i<numbers.size();i++){

            if(numbers.get(i) == search){
                System.out.println("found at " + i);
                return;
            }
            
        }

    }
}
