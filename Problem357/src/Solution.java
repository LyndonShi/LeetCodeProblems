public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n<1)return 1;
        int result=10;
        int factor=9;
        for (int i=1;i<n&&i<10;i++){
            factor=factor*(10-i);
            result=result+factor;
        }
        return result;
    }
}
