public class Solution {
    public String shortestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        for (; i != j; j--) {
            if (chars[j] == chars[i]) i++;
            else i = 0;
        }
        j=i*2+1;
        StringBuilder result=new StringBuilder();
        for (int head=chars.length-1;head>j;head--){
            result.append(chars[head]);
        }
        result.append(s);
        return String.valueOf(result);
    }
}
