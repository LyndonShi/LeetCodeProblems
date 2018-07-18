public class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        int j = 0;
        int i = 0;
        int lastTar = -S.length();
        for (; i < S.length(); i++) {
            result[i]=i-lastTar;
            if (S.charAt(i) == C) {
                for (; j <= i; j++) {
                    result[j] = Math.min((i - j), (j - lastTar));

                }
                lastTar = i;
            }

        }
        return result;
    }
}
