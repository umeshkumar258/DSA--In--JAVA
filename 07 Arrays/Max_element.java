public class Max_element {
    
    static  int Maxele(){

        int[] numbers = {10,20,30,40};

        int max = numbers[0];

        for(int i = 0;i<numbers.length;i++){

            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        int result = Maxele();

        System.out.println(result);
    }
}
