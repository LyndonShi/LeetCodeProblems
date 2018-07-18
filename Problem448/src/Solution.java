import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> notAppear = new ArrayList<>();
        int[] appearNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            appearNums[nums[i]]++;
        }
        for (int i = 1; i < appearNums.length; i++) {
            if (appearNums[i] == 0)
                notAppear.add(i);
        }
        return notAppear;
    }
}
