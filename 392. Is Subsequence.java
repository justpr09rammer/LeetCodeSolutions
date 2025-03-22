class Solution {
    public boolean isSubsequence(String s, String t) {
        int leftPointer1 = 0;
        int leftPointer2 = 0;
        while (leftPointer1 < s.length() && leftPointer2 < t.length()) {
            if (s.charAt(leftPointer1) == t.charAt(leftPointer2)) {
                leftPointer2 ++;
                leftPointer1 ++;
            }
            else {
                leftPointer2 ++;
            }
        }
        return leftPointer1 == s.length();
    }
}
