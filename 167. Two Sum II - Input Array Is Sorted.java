class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int leftPointer = 0, rightPointer = numbers.length - 1;
        while (leftPointer < rightPointer) {
            if (numbers[leftPointer] + numbers[rightPointer] == target){
                result[0] = leftPointer + 1;
                result[1] = rightPointer + 1;
            }
            if(numbers[leftPointer] + numbers[rightPointer] < target){
                leftPointer++;
            }
            else{
                rightPointer --;
            }
        }
        return result;
    }
}
