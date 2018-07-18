public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num<1)return false;
        long t=num;
        while (t*t>num){
            t=(t+num/t)/2;
        }
        return t*t==num;
    }
}
