import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result= new int[nums1.length];

        List<Integer> linkNums2=new LinkedList<>();
        for (int i=0;i<nums2.length;i++){
            linkNums2.add(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            result[i]=-1;
        }
        for(int i=0; i<nums1.length;i++){
            for (int j=linkNums2.indexOf(nums1[i]);j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    result[i]=nums2[j];
                    break;
                }
            }
        }
        return result;
    }
}
