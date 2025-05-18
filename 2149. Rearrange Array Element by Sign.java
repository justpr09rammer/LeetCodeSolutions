class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        int positiveIdx = 0;
        int negativeIdx = 1;
        for (int element : nums){
            if (element > 0){
                array[positiveIdx] = element;
                positiveIdx += 2;
            }
            else {
                array[negativeIdx] = element;
                negativeIdx += 2;
            }
        }
        return array;
    }
}
