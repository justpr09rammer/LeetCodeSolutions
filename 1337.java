
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        PriorityQueue<Integer []> pq = new PriorityQueue<>((a,b)->
                Objects.equals(a[1], b[1]) ? b[0] - a[0] : b[1] - a[1]);
        int row = 0;
        for (int[] array : mat){
            int zeroCount = findTheNumberOfOnes(array);
            pq.offer(new Integer[]{row,zeroCount});
            if (pq.size() > k){
                pq.poll();
            }
            row ++;
        }
        int n = pq.size();
        for (int i = n - 1; i >= 0; i --){
            res[i] = pq.poll()[0];
        }
        return res;
    }

    private int findTheNumberOfOnes(int[] array){
        int left = 0;
        int right = array.length - 1;
        int ans = -1;
        while (left <= right){
            int middle = left + (right - left ) /2;
            if (array[middle] == 1){
                left = middle + 1;
                ans = middle;
            }
            else {
                right = middle - 1;
            }
        }
        return ans;
    }
}
