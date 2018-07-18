public class Solution {
    public int countPrimeSetBits(int L, int R) {
        int primes = 0;
        for (int i = L; i < R; i++) {
        if (isPrime(i)){
            primes++;
        }
        }
        return primes;
    }

    public boolean isPrime(int i){
        int bits =0;
        bits=Integer.bitCount(i);
        if(bits==2||bits==3||bits==5||bits==7||bits==11||bits==13||bits==17||bits==19)
            return true;
        return false;
    }
}
