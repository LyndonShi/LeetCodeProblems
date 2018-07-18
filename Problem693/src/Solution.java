public class Solution {
    public boolean hasAlternatingBits(int n) {
        String bitNums = Integer.toBinaryString(n);
        for (int i = 1; i < bitNums.length(); i++) {
            if (bitNums.charAt(i) == bitNums.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
