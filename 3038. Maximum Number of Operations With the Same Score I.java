
class Solution {
    public int maxOperations(int[] nums) {
        if (nums.length < 2){
            return 0;
        }
        int target = nums[0] + nums[1];
        int result= 0;
        for (int i = 0; i < nums.length - 1; i += 2){
            if (nums[i] + nums[i + 1] != target) break;
            result ++;
        }
        return result;
    }
}
