public class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length==1)return 0;
        int bigest;
        int secondBig;
        if (nums[0]>nums[1]){
            bigest=0;
            secondBig=1;
        }else {
            bigest=1;
            secondBig=0;
        }

        for (int i=1;i<nums.length;i++){
            if (nums[i]>nums[bigest]){
                secondBig=bigest;
                bigest=i;
            }else if (nums[i]>nums[secondBig]){
                secondBig=i;
            }
        }

        if (nums[bigest]/2>=nums[secondBig])return bigest;
        else return -1;
    }
}
