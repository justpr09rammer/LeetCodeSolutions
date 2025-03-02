class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] array : nums1) {
            map.put(array[0], map.getOrDefault(array[0], 0) + array[1]);
        }
        for (int[] array : nums2) {
            map.put(array[0], map.getOrDefault(array[0], 0) + array[1]);
        }
        int i = 0;
        int n = map.size();
        int[][] result = new int[n][2];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();
            i ++;
        }
        return result;
    }
}
