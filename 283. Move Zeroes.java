class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i ++){
            if(nums[i] != 0){
                nums[temp] = nums[i];
                temp ++;
            }    
        }
        int zeroCount = nums.length - temp;
        for(int i = nums.length - 1; i >= nums.length - zeroCount; i --){
            nums[i] = 0;
        }
    }
}
