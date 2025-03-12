class Solution {
    public int maximumCount(int[] nums) {
        int negative = 0, zero = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == 0) zero ++;
            else if (nums[i] > 0){
                return Math.max(negative, nums.length - negative - zero);
            }else negative ++;
        }
        return negative;
    }
}
