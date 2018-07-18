public class Solution {
    public int addDigits(int num) {

        int result = 0;
        while (num > 0) {
            result = result + num % 10;
            num /= 10;
        }
        if (result > 9) {
            result = addDigits(result);
        }
        return result;
    }
}
