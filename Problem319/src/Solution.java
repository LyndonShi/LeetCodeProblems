public class Solution {
    public int bulbSwitch(int n) {
        int bulbOn = 0;
        for (int i = 1; i * i <= n; i++) bulbOn++;
        return bulbOn;
    }
}
