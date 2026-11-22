import java.util.*;
import java.util.ArrayList;

public class binary {
    public static void main(String[] args) {
        
        int[] arr = {10,40,2,55,30};

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int target = 2;

        int index = -1;


        while(left <= right){

            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                index = mid;
                break;
            }
            else if (arr[mid] > target){
                right = mid -1;
                
            }
            else{
                left = mid + 1;
            }
        }


        if(index != 1){
            System.out.println("Element found at index" + index);
        }else{
            System.out.println("element doesn't found..");
        }

    }
}
