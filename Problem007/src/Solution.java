public class Solution {
    public int reverse(int x) {
        double result = 0;
        for (; x != 0; x = x / 10) {
            result = result * 10 + x % 10;
        }
        if (result >= Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)result;
    }
}
