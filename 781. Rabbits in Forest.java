class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int answer : answers) {
            map.put(answer, map.getOrDefault(answer, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int spaceForOneKey = entry.getKey() + 1;
            //if it is 4, it means we need 5 spaces, and we can store up to 5 fours here
            int temp = entry.getValue() / spaceForOneKey;
            result += (spaceForOneKey * temp);
            if (entry.getValue() % spaceForOneKey != 0) {
                result += spaceForOneKey;
            }
        }
        return result;
    }
}
