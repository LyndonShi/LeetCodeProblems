public class Solution {
    public int maximumSwap(int num) {
        char[] nums = Integer.toString(num).toCharArray();
        int[] lastNums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            lastNums[nums[i] - '0'] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int d = 9; d > nums[i] - '0'; d--) {
                if (lastNums[d] > i) {
                    char temp = nums[i];
                    nums[i] = nums[lastNums[d]];
                    nums[lastNums[d]] = temp;
                    return Integer.valueOf(new String(nums));
                }
            }
        }
        return num;
    }
}
