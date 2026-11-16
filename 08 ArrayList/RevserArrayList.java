import java.util.ArrayList;

public class RevserArrayList {
    public static void main(String[] args) {
        
        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(33);
        numbers.add(44);
        numbers.add(55);
        numbers.add(66);

        int left = 0;
        int right = numbers.size() - 1;

        while(left < right){

            int temp = numbers.get(left);

            numbers.set(left,numbers.get(right));
            numbers.set(right,temp);

            left++;
            right++;

        }

        for(int num: numbers){
            System.out.println(num);
        }


    }
}
