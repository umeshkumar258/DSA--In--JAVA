import java.util.*;

public class linear{
    public static void main(String[] args) {
        
        int[] arr = {10,20,47,2,44};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ele to find...");
        int target = sc.nextInt();


        int index = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]  == target){
                index = i;
                break;
            }

        }

        if(index != -1){
            System.out.println("the found index is " + index);
        }
        else{
            System.out.println("element not found..");
        }
    }
}