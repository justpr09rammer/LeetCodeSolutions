
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int allMultiplication = 1;
        int countOfZeroes = 0;
        int idxOfZero = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                countOfZeroes++;
                idxOfZero = i;
            }
            else {
                allMultiplication *= nums[i];
            }
            if (countOfZeroes >= 2) {
                return new int[n];
            }
        }
        if (countOfZeroes == 1) {
            ans[idxOfZero] = allMultiplication;
            return ans;
        }
        else {
            for (int i = 0; i < n; i++) {
                ans[i] = allMultiplication / nums[i];
            }
            return ans;
        }
    }
}
