class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = n * (n + 1) / 2;
        int k = n / m;
        return sum - 2 * m * (k + 1) * k / 2;
    }
}
