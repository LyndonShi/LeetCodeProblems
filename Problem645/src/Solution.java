import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] result=new int[2];
       int max=nums.length;
       int ideaSum=(1+max)*max/2;
       int sum=0;
        Set<Integer>elements=new HashSet<>();
        for (int num:nums ){
            if(!elements.add(num))
                result[0]=num;
            sum+=num;
        }
        result[1]=ideaSum-sum+result[0];
        return result;
    }
}
