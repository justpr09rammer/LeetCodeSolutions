
class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> mapReal = new HashMap<>();
        mapReal.put('b', 1);
        mapReal.put('a', 1);
        mapReal.put('l', 2);
        mapReal.put('o', 2);
        mapReal.put('n', 1);
        Map<Character, Integer> mapText = new HashMap<>();
        int result = Integer.MAX_VALUE;
        for (Character ch : text.toCharArray()){
            if (mapReal.containsKey(ch)){
                mapText.put(ch, mapText.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : mapReal.entrySet()) {
            Character ch = entry.getKey();
            result = Math.min(result, mapText.getOrDefault(ch, 0) / mapReal.get(ch));
        }
        return result;
    }
}
