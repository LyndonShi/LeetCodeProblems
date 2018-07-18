public class Solution {
    public int missingNumber(int[] nums) {
      int sum=0;
      int ideaSum=nums.length*(nums.length+1)/2;
      for (int num:nums){
          sum+=num;
      }
      return ideaSum-sum;
    }
}
