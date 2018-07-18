import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        int distance = nums.length;
        int maxDegree = 0;
        Map<Integer, Integer> start = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();
        Map<Integer, Integer> degree = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (start.get(nums[i]) == null) {
                start.put(nums[i], i);

            }
            end.put(nums[i], i);
            degree.put(nums[i], degree.getOrDefault(nums[i], 0) + 1);
        }
        maxDegree = Collections.max(degree.values());
        for (int i : degree.keySet()) {
            if(degree.get(i)==maxDegree){
                distance=Math.min(distance,end.get(i)-start.get(i)+1);
            }
        }
        return distance;

    }
}
