public class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int lines=1;
        int usedUnit=0;
        for (int i=0;i< S.length();i++){

            if (usedUnit+widths[S.charAt(i)-'a']>100){
                lines++;
                usedUnit=widths[S.charAt(i)-'a'];
            }else usedUnit+=widths[S.charAt(i)-'a'];
        }
        return new int[]{lines,usedUnit};
    }
}
