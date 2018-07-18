public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int score1=0;
        int score2=0;
        if (nums.length<3)return true;
        while (i<=j){
            if (i==j){
                score1=score1+nums[i];
                break;
            }
            if (nums[i]+nums[j-1]<nums[i+1]+nums[j]){
                score1=score1+nums[j];
                j--;
            }else {
                score1=score1+nums[1];
                i++;
            }
            if (i==j){
                score2=score2+nums[i];
                break;
            }
            if (nums[i]+nums[j-1]<nums[i+1]+nums[j]){
                score2=score2+nums[j];
                j--;
            }else {
                score2=score2+nums[1];
                i++;
            }
        }
        return score1>score2;
    }
}
