
class Solution {
    public int findNumbers(int[] nums) {

        int n = nums.length;

        int count2 = 0;

        for (int i = 0; i < n; i++) {

            int count = 0;  // Reset for every number

            while (nums[i] > 0) {

                nums[i] = nums[i] / 10;

                count++;
            }

            if (count % 2 == 0) {
                count2++;
            }
        }

        return count2;
    }
}
