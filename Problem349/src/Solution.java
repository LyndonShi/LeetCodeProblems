import java.util.HashSet;
import java.util.Set;


public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> elements = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        int i = 0;

        for (Integer num : nums1) {
            elements.add(num);
        }
        for (Integer num : nums2) {
            if (elements.contains(num)) {
                result.add(num);
            }
        }
        int[] intersect = new int[result.size()];
        for (Integer num : result)
            intersect[i++] = num;
        return intersect;
    }
}
