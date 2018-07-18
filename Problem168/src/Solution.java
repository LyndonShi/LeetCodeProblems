public class Solution {
    public String convertToTitle(int n) {
        String res = "";
        while(n != 0) {
            char ch = (char)((n - 1) % 26 + 'A');
            n = (n - 1) / 26;
            res = ch + res;
        }
        return res;
    }

//    public String convertToTitle(int n) {
//        String result = "";
//        if (n-1 > 25) {
//            result = result + (char) ('A' + (n-1) / 26 );
//            result = result + (char) ('A' + (n-1) %26);
//        } else
//            result = result + (char) ('A' + n - 1);
//        return result;
//    }
}
