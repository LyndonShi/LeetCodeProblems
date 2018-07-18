public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) return 0;
        int len = 0;
        int DP=0;
        for (int i=2;i<A.length;i++){
            if (A[i]-A[i-1]==A[i-1]-A[i-2]){
                len++;
                DP=DP+len;
            }else {
                len=0;
            }
        }
        return DP;
    }
}
