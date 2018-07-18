public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                if (i < chars.length - 1 && chars[i + 1] == 'V') {
                    result = result + 4;
                    i++;
                } else if (i < chars.length - 1 && chars[i + 1] == 'X') {
                    result = result + 9;
                    i++;
                } else
                    result = result + 1;
            } else if (chars[i] == 'V') {
                result = result + 5;
            } else if (chars[i] == 'X') {
                if (i < chars.length - 1 && chars[i + 1] == 'L') {
                    result = result + 40;
                    i++;
                } else if (i < chars.length - 1 && chars[i + 1] == 'C') {
                    result = result + 90;
                    i++;
                } else
                    result = result + 10;
            } else if (chars[i] == 'L') {
                result = result + 50;
            } else if (chars[i] == 'C') {
                if (i < chars.length - 1 && chars[i + 1] == 'D') {
                    result = result + 400;
                    i++;
                } else if (i < chars.length - 1 && chars[i + 1] == 'M') {
                    result = result + 900;
                    i++;
                } else
                    result = result + 100;
            } else if (chars[i] == 'D') {
                result = result + 500;
            } else if (chars[i] == 'M') {
                result = result + 1000;
            }
        }
        return result;
    }
}
