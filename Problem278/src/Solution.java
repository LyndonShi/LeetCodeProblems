public class Solution {
    public boolean isBadVersion(int version) {
        return true;
    }

    public int firstBadVersion(int n) {
        if (n < 1) return 0;
        int good = 1;
        int bad = n;
        while (good < bad) {
            int mid=good+(bad-good)/2;//(good+bad)/2 may exceed the rang of Integer!
            if (isBadVersion(mid)){
                bad=mid;
            }else good=mid+1;
        }
        return bad;
    }

}
