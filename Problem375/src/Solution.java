public class Solution {
    public int getMoneyAmount(int n) {
        int start = 1;
        int end = n;
        int mid = start + (end - start) / 2;
        int cost = 0;
        while (start != end) {
            cost = cost + mid;
            start = mid + 1;
            mid = start + (end - start) / 2;
        }
        return cost;
    }
}
