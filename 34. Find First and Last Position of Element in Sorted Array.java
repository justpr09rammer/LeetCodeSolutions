import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length == 0) return result;

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1;
            } 
            
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            
            else {
                right = mid - 1;
            }
        }

        if (result[0] == -1) return result;

        left = result[0];

        right = nums.length - 1;

        while (left <= right) {


            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                
                left = mid + 1;
            } 
            
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return result;
    }
}
