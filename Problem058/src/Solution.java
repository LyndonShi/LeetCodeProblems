public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int i = words.length-1;
        if(i<0)return 0;
        return words[i].length();
    }
}
