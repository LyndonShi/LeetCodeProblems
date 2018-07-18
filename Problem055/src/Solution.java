public class Solution {
    public boolean canJump(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0) {
                for (int j = i; j >= 0; j--) {
                    if (nums[j] > i - j) {
                        j = -1;
                    }else if(j==0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
