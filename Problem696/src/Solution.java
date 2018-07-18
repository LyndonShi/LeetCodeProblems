public class Solution {
    public int countBinarySubstrings(String s) {
        int result = 0;
        int consecuNum = 1;
        int lastConsecu = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                lastConsecu = consecuNum;
                consecuNum = 1;
            } else {
                consecuNum++;
            }
            if (consecuNum <= lastConsecu)
                result++;
        }
        return result;
    }
}
