class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        int max = -1;
        for (int element : nums){
            arr[element] ++;
            max = Math.max(arr[element], max);
        }
        int result = 0;
        for (int frequency : arr){
            if (max == frequency){
                result += max;
            }
        }
        return result;
    }
}
