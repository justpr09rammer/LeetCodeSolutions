class Solution {
    public String mergeAlternately(String word1, String word2) {
        int leftPointer = 0;
        StringBuilder result = new StringBuilder();
        while (leftPointer < word1.length() && leftPointer < word2.length()) {
            result.append(word1.charAt(leftPointer));
            result.append(word2.charAt(leftPointer));
            leftPointer ++;
        }
        if (leftPointer < word1.length()) {
            result.append(word1, leftPointer, word1.length());
        }
        if (leftPointer < word2.length()) {
            result.append(word2, leftPointer, word2.length());
        }
        return result.toString();
    }
}
