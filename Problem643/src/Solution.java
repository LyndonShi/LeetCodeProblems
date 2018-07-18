public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = 0;
        double curAve=0;
        if (nums.length == 0) return 0;
        if (nums.length < k) {
            for (int num : nums) {
                average += num;
            }
            average /= nums.length;
            return average;
        }
        for (int i=0;i<k;i++){
            curAve=curAve+nums[i];
        }
        average=curAve;
        for (int i=k;i<nums.length;i++){
            curAve=curAve-nums[i-k]+nums[i];
            if (curAve>average){
                average=curAve;
            }
        }
        return average/k;
    }
}
