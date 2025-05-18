class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i ++){
            int temp = 0;
            int x = nums[i];
            while (x > 0){
                temp += x % 10;
                x /= 10;
            }
            if (temp == i){
                return i;
            }
            
        }
        return -1;
    }
}
