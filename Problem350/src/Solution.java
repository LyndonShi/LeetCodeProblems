
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> sequence = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0, j = 0, x = 0; (i < (nums1.length)) && (j < (nums2.length)); ) {
            if (nums1[i] == nums2[j]) {
                sequence.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j])
                j++;
            else if (nums1[i] < nums2[j])
                i++;
        }
        int[] result = new int[sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            result[i] = sequence.get(i);
        }
        return result;
    }
}
