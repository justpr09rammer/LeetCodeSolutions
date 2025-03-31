
class Solution {
    public int[] minCosts(int[] cost) {
        int minCost = Integer.MAX_VALUE;
        int[] res = new int[cost.length];
        for (int i = 0; i < cost.length; i++) {
            minCost = Math.min(minCost, cost[i]);
            res[i] = minCost;
        }
        return res;
    }
}
©leetcode
