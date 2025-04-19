
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int current = nums[i];
            int lowerTarget = lower - current;
            int upperTarget = upper - current;
            int left = lowerBound(nums, i + 1, n - 1, lowerTarget);
            int right = upperBound(nums, i + 1, n - 1, upperTarget);
            if (left <= right) {
                count += (right - left + 1);
            }
        }
    


        return count;
    }
    
    private int lowerBound(int[] nums, int left, int right, int target) {
        int result = right + 1; 
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {

                result = mid;
                right = mid - 1;

            } 
            else {
                left = mid + 1;
            }
        }
        return result;
    }
    
    private int upperBound(int[] nums, int left, int right, int target) {
        int result = left - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                result = mid;
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return result;
    }
}2563. Count the Number of Fair Pairs
