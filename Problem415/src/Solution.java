public class Solution {
    public String addStrings(String num1, String num2) {
        char[] nums1 = num1.toCharArray();
        char[] nums2 = num2.toCharArray();
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = nums1.length - 1;
        int j = nums2.length - 1;

        while (i >= 0 || j >= 0 || carry >1) {
            int a = i >= 0 ? (nums1[i--] - '0') : 0;
            int b = j >= 0 ? (nums2[j--] - '0') : 0;
            int sum = a + b + carry;
            result.insert(0, sum % 10);
            carry = sum / 10;
        }
        return result.toString();
    }
}
