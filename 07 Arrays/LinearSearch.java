public class LinearSearch {

    static int Search1( int n) {


        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                return i; // Found target, return index immediately
            }
        }
        return -1; // Checked entire array without finding target
    }

    public static void main(String[] args) {
        

        int result1 = Search1( 25); // Fixed casing to match Search1

        if(result1 != -1){
            System.out.print(result1); // Prints: 1
        }
        else{
            System.out.println("Not found");
        }
        


    }
}