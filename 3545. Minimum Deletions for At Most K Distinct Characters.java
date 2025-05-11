class Solution {
    public int minDeletion(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(entry.getValue());
        }
        int result = 0;
        while (pq.size() > k){
            result += pq.peek();
            pq.poll();
        }
        return result;
    }
}
