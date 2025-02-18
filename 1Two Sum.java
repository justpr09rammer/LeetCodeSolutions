
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                ans[0] = map.get(temp);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i],i);
        }

        return ans;
    }
}
