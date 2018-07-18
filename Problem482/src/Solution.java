import java.util.Stack;

public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String formarted = "";
        S.toUpperCase();


        Stack<Character> original = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '-') {

                original.push(S.charAt(i));
            }
        }
formarted=original.toString().toUpperCase();
        for (int i = formarted.length(),j=0; i>=0; i++) {
            if (i == K) {
                formarted = '-' + formarted;
                i = 0;
            }
            formarted = original.pop() + formarted;
        }
        return formarted;
    }
}
