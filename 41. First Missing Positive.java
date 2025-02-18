class Solution {
// i have solved it with breute force approach
    public int firstMissingPositive(int[] nums) {
        boolean thereIsOne = false;
        int maxx = -1;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            maxx = Math.max(maxx, num);
            if (num == 1) {
                thereIsOne = true;
            }
            if (num > 0) {
                map.put(num, false);
            }
        }
        if (!thereIsOne) {
            return 1;
        }
        for (int i = 1; i <= maxx; i++) {
            if (!map.containsKey(i)) {
                return i; 
            }
        }
        return maxx + 1;
    }
}
