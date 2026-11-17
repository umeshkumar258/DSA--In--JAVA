import java.util.*;

public class input_arr {
    public static void main(String[] args) {
        
        int[][] number = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numbers to  2d aray..");

        for(int i = 0;i<number.length;i++){

            for(int j =0;j<number[i].length;j++){

                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array elements are: ");

        for(int i = 0;i<number.length;i++){

            for(int j =0;j<number[i].length;j++){

                System.out.print(number[i][j]);
            }
        }
    }
}
