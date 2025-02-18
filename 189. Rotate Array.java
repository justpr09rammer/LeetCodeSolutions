
class Solution {
    public void rotate(int[] nums, int k) {
        int modularK = k % nums.length;
        int[] array = new int[2 * nums.length];
        for (int i = 0; i < 2 * nums.length; i++) {
            array[i] = nums[i % nums.length];
        }
        int start = nums.length - modularK;
        int end = start + nums.length;

        int idx = 0;
        for (int i = start; i < end; i++) {
            nums[idx++] = array[i];
        }
    }
}
