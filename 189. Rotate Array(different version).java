
class Solution {
    public void rotate(int[] nums, int k) {

        int modularK = k % nums.length;
        int[] shiftedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            shiftedArray[(i + modularK) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = shiftedArray[i];
        }
    }
}
