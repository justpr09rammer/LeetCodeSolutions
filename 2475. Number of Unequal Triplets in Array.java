
class Solution {
    public int unequalTriplets(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i ++){
            for (int j = i + 1; j < nums.length; j ++){
                if (nums[i] == nums[j]){
                    continue;
                }
                for (int k = j + 1; k < nums.length; k ++){
                    if (nums[j] == nums[k] || nums[i] == nums[k]){
                        continue;
                    }
                    result ++;
                }
            }

        }
        return result;
    }
}
