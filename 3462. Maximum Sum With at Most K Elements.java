
class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int n = grid.length;
        int m = grid[0].length;
        long allSum = 0;
        PriorityQueue<Long> allPq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int limit = limits[i];
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for (int j = 0; j < m; j++) {
                allSum += grid[i][j];
                pq.add((long) grid[i][j]);
                if (pq.size() > limit) {
                    allSum -= pq.peek();
                    pq.poll();
                }
            }
            allPq.addAll(pq);
        }
        while (allPq.size() > k) {
            allSum -= allPq.peek();
            allPq.poll();
        }
        return allSum;
    }
}
