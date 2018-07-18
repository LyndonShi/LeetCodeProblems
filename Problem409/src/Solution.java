import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int count=0;
        Set<Character>characters=new HashSet<>();
        for (char x:chars){
            if (!characters.add(x)){
                count++;
                characters.remove(x);
            }
        }
        if (characters.isEmpty())return count*2;
        else return count*2+1;
    }

}
