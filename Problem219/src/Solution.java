import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> interval = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                interval.remove(nums[i - k - 1]);
            }
            if (!interval.add(nums[i]))
            {
                return true;
            }
        }
        return false;
    }


//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        int i=0;
//       Map<Integer,Integer> interval=new HashMap<>();
//        for (; i < k; i++) {
//           interval.put(i,nums[i]);
//           if(interval.containsValue(nums[i])){
//               return true;
//           }
//        }
//        for (;i<nums.length;i++){
//            interval.remove(i-k);
//            interval.put(i,nums[i]);
//            if(interval.containsValue(nums[i])){
//                return true;
//            }
//        }
//
//        return false;
//    }

}

