public class ReverseArray {
    
    static void reverse(int[] numbers){

        int n = numbers.length;

        int[] rev = new int[n];

        for(int i = 0;i<n;i++){
            rev[n-i-1] = numbers[i];
        }

        for(int i = 0;i<n;i++){
            System.out.println(rev[i]);
        }
    }

    public static void main(String[] args) {
        
        int[] numbers = {10,20,30,40};

        reverse(numbers);
    }
}
