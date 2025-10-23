class Solution {
    public static boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        while (sb.length() != 2) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < sb.length() - 1; i ++) {
                int sum = Character.getNumericValue(sb.charAt(i)) + Character.getNumericValue(sb.charAt(i + 1));
                temp.append(sum % 10);
            }
            sb = temp;
        }
        return sb.charAt(0) == sb.charAt(1);
    }
}
