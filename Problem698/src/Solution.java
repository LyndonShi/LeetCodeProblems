public class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        int average = sum / k;
        int averageEl=nums.length/k;
        if (average * k < sum)
            return false;

        for (int num:nums)
            if (num>average)
                return false;





        return true;
    }
}
