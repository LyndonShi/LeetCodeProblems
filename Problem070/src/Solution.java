public class Solution {
    public int climbStairs(int n) {
        if (n<1)return 0;
        if (n==1)return 1;
        int[] DP = new int[n + 1];
        DP[1] = 1;
        DP[2] = 2;
        for (int i=3;i<=n;i++){
            DP[i]=DP[i-1]+DP[i-2];
        }
        return DP[n];
    }
}
