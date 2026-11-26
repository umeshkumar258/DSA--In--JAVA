public class CoutingSort {

    static void coutingSort(int[] arr) {

        if (arr.length == 0) {
            return;
        }

        // Step 1: Find maximum
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create frequency array
        int[] count = new int[max + 1];

        // Step 3: Count frequencies
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 4: Reconstruct sorted array
        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        coutingSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}