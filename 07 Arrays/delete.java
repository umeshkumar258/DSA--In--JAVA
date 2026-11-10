public class delete {
    public static void main(String[] args) {
        
        int[] numbers = {10,20,30,40,50};

        int postion = 2;
        int size = numbers.length;

        for(int i = postion;i<size -1 ;i++){
            numbers[i] = numbers[i+1];
        }

        

        for(int i = 0;i<size-1;i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
