public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;

        for(int index=1;index<nums.length;index++){
            if(nums[index]!=nums[result]){
                result++;
                nums[result]=nums[index];
            }
        }
        return result +1;
    }
}
