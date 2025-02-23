
class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        if (n == 1 || n == 0){
            return false;
        }
        while (n > 2){
            int leftPointer = 0;
            StringBuilder temp = new StringBuilder();
            while (leftPointer < n - 1){
                Integer a = Integer.parseInt(String.valueOf(s.charAt(leftPointer)));
                Integer b = Integer.parseInt(String.valueOf(s.charAt(leftPointer + 1)));
                int c = (a + b) % 10;
                temp.append(Integer.toString(c));
                leftPointer ++;
            }
            n = temp.length();
            s = temp.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
