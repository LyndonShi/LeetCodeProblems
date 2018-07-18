public class Solution {
    public void sortColors(int[] nums) {
        int index0 = 0;
        int index2 = nums.length - 1;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[index0];
                nums[index0] = 0;
                index0++;
            }
            if (nums[i] == 2) {
                nums[i] = nums[index2];
                nums[index2] = 2;
                index2--;
                i--;
            }

        }
    }

    public void sortColors1(int[] nums) {
        // 1-pass
        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
    }
}
