import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[]nums=new int[n+1];

       for (int num:citations){
           if (num>=n){
               nums[n]++;
           }else nums[num]++;
       }
       int count=0;
       for (int i=n;i>=0;i--){
           count+=nums[i];
           if (count>=i)
               return i;
       }
       return 0;
    }
}
