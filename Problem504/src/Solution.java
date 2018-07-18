public class Solution {
    public String convertToBase7(int num) {
        String result = "";
        String sign = "";
        if (num == 0)
            return "0";
        if (num < 0) {
            sign = "-";
            num = Math.abs(num);
        }
        while (num > 0) {
            result = Integer.toString(num % 7) + result;
            num = num / 7;
        }

        return sign + result;
    }
}
