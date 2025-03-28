
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        Map<Integer, Integer> memo = new HashMap<>();
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        for (int i = 0; i < nums.length; i++) {
            int currentElement = nums[i];
            if (!memo.containsKey(nums[i])) {
                res[i] = findTheCorrectBound(sortedNums, currentElement);
                memo.put(nums[i], res[i]);
            }
            else res[i] = memo.get(nums[i]);
        }
        return res;
    }
    private int findTheCorrectBound(int[] nums, int element) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == element) {
                ans = middle;
                right = middle - 1;
            }
            else if (nums[middle] < element) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }
        return ans;
    }
}
