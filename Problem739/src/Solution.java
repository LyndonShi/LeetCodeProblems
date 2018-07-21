import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> highTemp=new Stack<>();
        for (int i = result.length - 1; i >= 0; i--){
            while (!highTemp.isEmpty()&&temperatures[i]>temperatures[highTemp.peek()])
                highTemp.pop();
           result[i]= highTemp.isEmpty()?0:highTemp.peek()-i;
           highTemp.push(i);
        }
        return result;
    }
}
