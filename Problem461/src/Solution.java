public class Solution {
    public int hammingDistance(int x, int y) {

        String BinX = Integer.toBinaryString(x);
        String BinY = Integer.toBinaryString(y);

        while (BinX.length()<32){
            BinX='0'+BinX;
        }
        while (BinY.length()<32){
            BinY='0'+BinY;
        }
        int diff=0;
        for(int i=0;i<32;i++){
            if (BinX.charAt(i)!= BinY.charAt(i)){
                diff++;
            }
        }

        return diff;
    }
}
