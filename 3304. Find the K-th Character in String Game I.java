
class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k){
            int n = sb.length();
            for (int i = 0; i < n; i ++){
                char nextChar = (char) ('a' + (sb.charAt(i) - 'a' + 1) % 26);
                sb.append(nextChar);
            }
        }
        return sb.charAt(k - 1);
    }
}
