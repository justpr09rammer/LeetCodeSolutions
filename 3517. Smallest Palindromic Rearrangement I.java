
class Solution {
    public String smallestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) return s;
        StringBuilder result = new StringBuilder();
        boolean isODD = s.length() % 2 == 1;
        int[] halfArray = new int[26];
        for (int i = 0; i < s.length() / 2; i++) {
            halfArray[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < halfArray.length; i++) {
            char ch = (char) ('a' + i);
            int temp = halfArray[i];
            while (temp > 0){
                result.append(ch);
                temp --;
            }
        }
        if (isODD) {
            result.append(s.charAt(s.length() / 2));
        }
        for (int i = halfArray.length - 1; i >= 0; i--) {
            char ch = (char) ('a' + i);
            int temp = halfArray[i];
            while (temp > 0){
                result.append(ch);
                temp --;
            }
        }
        return result.toString();
    }
}
