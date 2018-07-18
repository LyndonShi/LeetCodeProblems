public class Solution {
    public int findNthDigit(int n) {

        long count=9;//to void overflow
        int start=1;
        int len=1;
       while (n>len*count){
           n-=len*count;
           count*=10;
           len++;
           start*=10;
       }
       start+=(n-1)/len;
       String result=Integer.toString(start);
       return Character.getNumericValue(result.charAt((n-1)%len));
    }

}
