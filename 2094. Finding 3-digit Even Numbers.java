

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int element : digits){
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        for (int i = 100; i < 1001; i ++){
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            if (!map.containsKey(a) || !map.containsKey(b) || !map.containsKey(c)) {
                continue;
            }
            map.put(a, map.get(a)- 1);
            map.put(b, map.get(b)- 1);
            map.put(c, map.get(c)- 1);
            if (map.get(a) >= 0 && map.get(b) >= 0 && map.get(c) >= 0 && c % 2 == 0) {
                list.add(i);
            }
            map.put(a, map.get(a) + 1);
            map.put(b, map.get(b) + 1);
            map.put(c, map.get(c) + 1);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i ++){
            array[i] = list.get(i);
        }
        return array;

    }
}
