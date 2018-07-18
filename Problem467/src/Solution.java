import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int findSubstringInWraproundString(String p) {
        int result = 0;
        int[] eachMax = new int[26];
        int contiChar = 1;

        for (int i = 0; i < p.length(); i++) {
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i - 1) - p.charAt(i) == 25)) {
                contiChar++;
            }else contiChar=1;
            if(contiChar>eachMax[p.charAt(i)-'a']){
                eachMax[p.charAt(i)-'a']=contiChar;
            }
        }

        for (int num:eachMax){
            result+=num;
        }
        return result;
    }

}
