
class Solution {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Boolean> map = new HashMap<>();
        for (int element : nums) {
            set.add(element);
            map.put(element, false);
        }
        int maxx = 0;
        for (int element : set){
            if (!map.get(element)){
                int count = 1;
                if (set.contains(element + 1)){
                    continue;
                }
                else {
                    map.put(element, true);
                    while (set.contains(element - 1)){
                        count ++;
                        map.put(element - 1, true);
                        element -= 1;
                    }
                    maxx = Math.max(maxx, count);
                }
            }
        }


        return maxx;


    }
}
