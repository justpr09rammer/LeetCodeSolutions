class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if (n <= k && m <= k) {
            return 0L;
        }
        long result = 0L;
        if (n > k) {
            result += (long)(n - k) * k;
        }
        if (m > k) {
            result += (long)(m - k) * k;
        }
        return result;
    }
}
