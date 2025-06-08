
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        Set<Double> set = new HashSet<>();
        while (leftPointer < rightPointer){
            set.add((nums[leftPointer] + nums[rightPointer]) / 2.0);
            leftPointer++;
            rightPointer--;
        }
        return set.size();
    }
}
