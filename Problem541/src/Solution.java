public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 * k < k) {
                StringBuilder revers = new StringBuilder();
                int j = 0;
                for ( j = 0; j < k&&i<s.length(); j++) {
                    revers.append(s.charAt(i + j));
                }
                result.append(revers.reverse().toString());

                i=i+j-1;
            }else result.append(s.charAt(i));
        }
        return result.toString();
    }
}
