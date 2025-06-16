class Solution {
    public int maximumDifference(int[] nums) {
        int a = nums[0];
        int result = -1;
        for (int i = 1; i < nums.length; i ++){
            int b = nums[i];
            if (b <= a){
                a = b;
            }
            else {
                if (b - a > result){
                    result = b - a;
                }
            }
        }
        return result == 0 ? -1 : result;
    }
}
