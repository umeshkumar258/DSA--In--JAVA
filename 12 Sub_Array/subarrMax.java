public class subarrMax {
    public static void main(String[] args) {
        
        int arr[] = {33,32,32,-3,-2,88};

        int n  = arr.length;

        int maxSum = arr[0];

        for(int i = 0;i<n;i++){
            int curSum  = 0;

            for(int j = i;j<n;j++){
                curSum += arr[i];

                maxSum = Math.max(maxSum,curSum);
            }
        }

        System.out.println(maxSum);
    }
}
