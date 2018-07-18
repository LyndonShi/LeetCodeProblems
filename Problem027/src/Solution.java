public class Solution {
    public int removeElement(int[] nums, int val) {

        int temp =nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==val){
                nums[i] =nums[temp];
                nums[temp]=val;
                temp--;
            }
        }
        return temp+1;
    }
}