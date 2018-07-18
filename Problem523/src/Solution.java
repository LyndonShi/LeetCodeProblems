public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int begin = 0;
        int sum = 0;
        if (k<0)return false;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (sum>k){
                sum=sum-nums[begin];
                begin++;
            }
            if (sum==k)return true;
        }
        return false;
    }
}
//            if (sum == k) return true;
//            else if (sum > k) {
//                if (begin == i) {
//                    sum = 0;
//                    begin++;
//                }else {
//                    do {
//                        sum=sum-nums[begin];
//                        begin++;
//                    }while (sum>k);
//                }
//            }

