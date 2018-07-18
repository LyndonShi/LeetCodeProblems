public class Solution {
    public int maxSubArray(int[] nums) {
        int maxValue = nums[0];
        int endHereValue=nums[0];
        for(int i=1;i<nums.length;i++){
            endHereValue= Math.max(endHereValue+nums[i],nums[i]);
            maxValue=Math.max(maxValue,endHereValue);
        }
        return maxValue;
    }
}
