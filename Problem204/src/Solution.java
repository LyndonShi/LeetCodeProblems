public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] notPrimes=new boolean[n+1];
        for (int i=2;i<n+1;i++){
            if(notPrimes[i])continue;
            count++;
            for (int j=i;j*i<n+1;j++){
                notPrimes[j*i]=true;
            }
        }
        return count;
    }
}
