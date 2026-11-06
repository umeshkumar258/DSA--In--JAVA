public class fac {
    public static void main(String args[]){
        
        int num1 = 1234;

        int num2 = 0;



        while(num1 > 0){
            int rem  = num1 % 10;

            num2 = rem + num2 *10;

            num1 /= 10;
        }

        System.out.println(num2);


    }
}
