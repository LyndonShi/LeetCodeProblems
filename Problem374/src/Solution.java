public class Solution {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        int mid=start+(end-start)/2;
        while (guess(mid)!=0){
            if (guess(mid)==-1){
                end=mid;
            }else start=mid+1;

            mid=start+(end-start)/2;
        }
        return mid;
    }
    public int guess(int num){
        return -1;
    }
}
