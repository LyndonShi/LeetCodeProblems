import java.util.LinkedList;
import java.util.List;

public class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> vowels = new LinkedList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        char temp = ' ';
        for (int i = 0, j = chars.length - 1; i <= j; ) {
            if (vowels.contains(chars[i])) {
                if (vowels.contains(chars[j])) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    i++;
                    j--;
                } else j--;
            } else i++;
        }
        return String.valueOf(chars);
    }
}
