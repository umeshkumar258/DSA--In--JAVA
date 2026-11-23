public class kadensalgo {
    public static void main(String[] args) {
        int arr[] = {-3,1,3,-3,2,8};

        int n  = arr.length;

        int maxSum = arr[0];

        int currSum  = arr[0];

        for(int i = 1;i<n;i++){

            currSum = Math.max(arr[i],currSum+arr[i]);

            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
}
