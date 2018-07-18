import java.util.Stack;

public class Solution {
    public int calPoints(String[] ops) {
        int i = 0;
        Stack<Integer> nums = new Stack<>();
        int sum = 0;
        while (i < ops.length) {
            if (ops[i].equals("C" ) && !nums.isEmpty()) {
                sum -= nums.pop();
            } else if (ops[i].equals("D" )  && !nums.isEmpty()) {
                sum += nums.push(2 * nums.peek());
            } else if (ops[i].equals("+" )  && nums.size() > 1) {
                sum += nums.push(nums.peek() + nums.get(nums.size() - 2));
            } else {
                sum += nums.push(Integer.valueOf(ops[i]));
            }
            i++;
        }

        return sum;
    }
}
