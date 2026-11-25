public class BubbleSort{

        public static void bulle(){
            int[] arr = {33,3,23,53,322,99,8};

            int n = arr.length;
            
            for(int i = 0;i<n;i++)
                {
                for(int j = 0 ;j<n-1-i;j++){
                    if(arr[j] > arr[j+1]){

                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
           for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
           } 
        }

    public static void main(String[] args) {
        
        bulle();
    }
}