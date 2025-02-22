
class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        int count = 0;
        for (int i = 0; i <= n; i ++){
            isPrime[i] = true;
        }
        for (int i = 2; i < n; i ++){
            if (isPrime[i]){
                count ++;
                for (long j = (long) i *(long) i; j < n; j += i){
                    isPrime[(int) j] = false;
                }
            }
        }
        return count;
    }
}
