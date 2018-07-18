public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result ="" ;

        char[] chars1;
        char[] chars2;
        chars1 = strs[0].toCharArray();
        int index = chars1.length;
        for (int i = 1, j; i < strs.length && index > 0; i++) {
            chars2 = strs[i].toCharArray();
            for (j = 0; chars1[j] == chars2[j]; ) {
                j++;
            }
            if (j < index && j > 0) {
                index = j + 1;
            } else return "";
        }
        for(int i=0;i<index;i++){
            result =result+chars1[i];
        }
        return result;
    }

}

