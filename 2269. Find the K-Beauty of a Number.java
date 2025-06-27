class Solution {
    public int divisorSubstrings(int num, int k) {
        int result = 0;
        String s = String.valueOf(num);
        int n = s.length();
        int leftPointer = 0;
        while (leftPointer + k <= n) {
            String substring = s.substring(leftPointer, leftPointer + k);
            int divisor = Integer.parseInt(substring);
            if (divisor != 0 && num % divisor == 0) {
                result++;
            }
            leftPointer++;
        }
        return result;
    }
}
