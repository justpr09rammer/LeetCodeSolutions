
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int[] array = new int[2];
        int repeated = -1, missing = -1, n = grid.length * grid[0].length;
        int sum = n * (n + 1) / 2, actualSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                actualSum += grid[i][j];
                if (!set.contains(grid[i][j])) {
                    set.add(grid[i][j]);
                }
                else {
                    repeated = grid[i][j];
                    System.out.println(repeated);
                    actualSum -= repeated;
                }
            }
        }
        missing = sum - actualSum;
        array[0] = repeated;
        array[1] = missing;
        return array;
    }
}
