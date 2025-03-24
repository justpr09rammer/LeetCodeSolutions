
class Solution {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;
        int width = height.length - 1;
        while (leftPointer < rightPointer) {
            int length = Math.min(height[leftPointer], height[rightPointer]);
            int area = length * width;
            maxArea = Math.max(area, maxArea);
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer ++;
            }
            else rightPointer --;
            width --;
        }
        return maxArea;
    }
}
