class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        int positivePointer = 0, negativePointer = 0;
        int i = 0;
        while (negativePointer < n && positivePointer < n){
            while (nums[positivePointer] < 0){
                positivePointer ++;
            }
            while (nums[negativePointer] > 0){
                negativePointer ++;
            }
            array[i] = nums[positivePointer];
            array[i + 1] = nums[negativePointer];
            i += 2;
            positivePointer ++;
            negativePointer ++;
        }
        return array;
    }
}
