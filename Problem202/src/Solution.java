import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> nums=new HashSet<>();
        while (n!=1){
            int result=0;
            for (;n!=0;){
                result=result+(n%10)*(n%10);
                n=n/10;
            }
            if (!nums.add(result))return false;
            n=result;
        }
        return true;

//        int[] results;
//        int result =0;
//        for (;n>0;n=n/10){
//            result=result+(n%10)^2;
//        }
//
//        if (result==1){
//            return true;
//        }else isHappy(result);
//        return false;
    }
}
