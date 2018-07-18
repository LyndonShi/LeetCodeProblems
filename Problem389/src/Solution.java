public class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();// abcd->dbc a->dc ba->d cba-> dcba
        char[] tArr = t.toCharArray();//abcde//a  b   c     d       e
        int sLength = sArr.length ;
        int i = 0;
        int j = 0;
        char temp;
        for (; i < sLength; i++) {
            if (tArr[j] == sArr[i]) {
                temp = sArr[i];
                sArr[i] = sArr[j];
                sArr[j] = temp;

                i = j;
                j++;
            }
        }
        return tArr[j];

        //        for (int i = 0; i < sArr.length; i++) {
//            for (; j < tLength; j++) {
//
//                if (sArr[i] == tArr[j]) {
//                    tArr[j] = tArr[tLength];
//                    tArr[tLength] = sArr[i];
//                    tLength--;
//                    j = 0;
//                    i++;
//
//                }
//
//            }
//
//        }
//        return ' ';

    }
}
