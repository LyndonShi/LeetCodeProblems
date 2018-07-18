import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for (int num : nums) {
            if (!elements.add(num))
                return true;
        }
        return false;
    }
}
