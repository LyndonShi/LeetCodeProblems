
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> maxConse = new HashSet<>();
        int max = 0;
        int currenMax = 0;

        for (int num : nums) {
            maxConse.add(num);
        }
        for (int num : nums) {
            if (!maxConse.contains(num - 1)) {
                currenMax=1;
                while (maxConse.contains(num+1)){
                    num++;
                    currenMax++;
                }
                if (currenMax>max)
                    max=currenMax;
            }
        }
        return max;
    }
}
