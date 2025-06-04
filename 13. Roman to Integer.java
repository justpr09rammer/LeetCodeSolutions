
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length();i ++){
            int currentElement = map.get(s.charAt(i));
            result += currentElement;
            if (i >= 1 && currentElement >  map.get(s.charAt(i - 1))){
                result -= 2 * map.get(s.charAt(i - 1));
            }
        }
        return result;
    }
}
