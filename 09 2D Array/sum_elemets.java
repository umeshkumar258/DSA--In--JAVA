import java.util.*;

public class sum_elemets {
    


    public static void main(String[] args) {
        
        int[][] number = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numbers to  2d aray..");

        for(int i = 0;i<number.length;i++){

            for(int j =0;j<number[i].length;j++){

                number[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        System.out.println("The array elements are: ");

        for(int i = 0;i<number.length;i++){

            for(int j =0;j<number[i].length;j++){

                sum += number[i][j];
            }
        }
        System.out.println(sum);
    }
}


