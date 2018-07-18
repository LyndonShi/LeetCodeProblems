import java.util.LinkedList;
import java.util.List;

public class Solution {
    public String getPermutation(int n, int k) {
        int nFraction = 1;
        String result = "";
        if (n < 1) {
            return "";
        }
        int temp = n - 1;
        while (temp > 0) {
            nFraction = nFraction * temp;
            temp--;
        }
        List<Integer> nums = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        k = k - 1;

        while (true) {

            result = result + nums.remove(k / nFraction);
            k = k % nFraction;
            if (nums.isEmpty())break;
            nFraction = nFraction / nums.size();
        }
        return result;
//        while (n > 0&&nFraction>0&&(k%nFraction)!=0) {
//            int index = k / nFraction;
//            int tempBit = nums.get(index);
//            nums.remove(index);
//            nums.add(numLenth - n, tempBit);
//            k = k % nFraction;
//            nFraction = nFraction / n;
//            n--;
//        }
//        for (int x:nums){
//            result=result+x;
//        }

    }

}
