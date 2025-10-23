class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int rightPointer = 0;
        int n = s.length();
        if (n <= 1){
            return n;
        }
        Set<Character> set = new HashSet<>();
        int maxx = 1;
        while (rightPointer < n) {
            if (!set.contains(s.charAt(rightPointer))) {
                set.add(s.charAt(rightPointer));
                maxx = Math.max(maxx, set.size());
                rightPointer++;
            } 
            else {
                while (s.charAt(leftPointer) != s.charAt(rightPointer)){
                    set.remove(s.charAt(leftPointer));
                    leftPointer ++;
                }
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }

         return maxx;

    }
}
