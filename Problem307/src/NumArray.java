public class NumArray {
   private int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public void update(int i, int val) {
        int dif = val-(sum[i + 1] - sum[i]);
        for (int j=i+1;j<sum.length;j++){
            sum[j]+=dif;
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
