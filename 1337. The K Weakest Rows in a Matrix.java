
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        PriorityQueue<Integer []> pq = new PriorityQueue<>((a,b)->
                Objects.equals(a[1], b[1]) ? b[0] - a[0] : b[1] - a[1]);
        int row = 0;
        for (int[] array : mat){
            int count = 0;
            for (int i : array){
                if (i == 1){
                    count ++;
                }
            }
            pq.offer(new Integer[]{row,count});
            if (pq.size() > k){
                pq.poll();
                System.out.println(Arrays.toString(pq.toArray()));
            }
            row ++;
        }
        int n = pq.size();
        for (int i = n - 1; i >= 0; i --){
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
