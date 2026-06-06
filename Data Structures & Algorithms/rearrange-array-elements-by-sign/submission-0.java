public class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if ((i % 2 == 0 && nums[i] > 0) || (i % 2 == 1 && nums[i] < 0)) {
                continue;
            }

            int j = i + 1;
            while (j < n && ((nums[j] > 0) == (nums[i] > 0))) {
                j++;
            }

            int temp = nums[j];
            while (j > i) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[i] = temp;
        }
        return nums;
    }
}