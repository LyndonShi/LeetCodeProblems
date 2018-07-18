public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = m - 1, j = n - 1;
        for (; i >= 0&&j>=0; ) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                index--;
                i--;
            } else {
                nums1[index] = nums2[j];
                index--;
                j--;
            }

        }
        for (; j >= 0; j--, index--) {
            nums1[index] = nums2[j];
        }
        return;
    }
}
