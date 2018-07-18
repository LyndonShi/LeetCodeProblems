import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            String rang = String.valueOf(nums[i]);
            if (i<nums.length-1&&nums[i] + 1 == nums[i + 1]) {
                while (i<nums.length-1&&nums[i] + 1 == nums[i + 1]) {
                    i++;
                }
                rang=rang+"->"+nums[i];
            }
            result.add(rang);
        }
        return result;
    }
}
