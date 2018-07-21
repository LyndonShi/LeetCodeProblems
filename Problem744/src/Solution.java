import java.util.HashSet;
import java.util.Set;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters.length < 1) return ' ';
        int low = 0;
        int high = letters.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return letters[low % letters.length];
    }
}
