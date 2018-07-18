public class Solution {


    public int rob(int[] nums) {
        int robThis=0;
        int notRobPrevious=0;
        int notRobThis=0;
        for (int num:nums){

            notRobThis=Math.max(notRobPrevious,robThis);
            robThis=notRobPrevious+num;
            notRobPrevious=notRobThis;
        }
        return Math.max(robThis,notRobThis);

    }
}
