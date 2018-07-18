public class Solution {
    public String addBinary(String a, String b) {
        String result = "";

        result=Integer.toBinaryString(Integer.parseInt(a)+Integer.parseInt(b));

        return result;
    }

}
