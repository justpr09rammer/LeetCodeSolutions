
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        int leftPointer = 0;
        int rightPointer = sb.length() - 1;
        while (leftPointer <= rightPointer) {
            char leftChar = sb.charAt(leftPointer);
            char rightChar = sb.charAt(rightPointer);
            if (leftChar != rightChar) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
