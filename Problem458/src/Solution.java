public class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {

        int times;
        if (minutesToTest % minutesToDie == 0)
            times = minutesToTest / minutesToDie;
        else
            times = (minutesToTest / minutesToDie) + 1;
        if (buckets - 1 <= times)
            return 1;
        if ((buckets - 1) % times == 0)
            return (buckets - 1) / times;
        else return ((buckets - 1) / times) + 1;


    }
}
