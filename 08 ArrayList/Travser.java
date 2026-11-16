import java.util.ArrayList;

public class Travser {
    public static void main(String[] args) {
        
        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(33);
        numbers.add(88);

        for(int i = 0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        for(int num: numbers){
            System.out.println(num);
        }

        numbers.forEach(num -> System.out.println(num));

    }
}
