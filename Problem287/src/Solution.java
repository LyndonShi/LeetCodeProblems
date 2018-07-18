public class Solution {
    public int findDuplicate(int[] nums) {
        int temp ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                } else {

                    temp=nums[i];
                    nums[i]=nums[nums[i]];
                    nums[nums[i]]=temp;
                }
            }

        }
        return nums[0];
    }
}
