
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int pointerA = a.length() - 1;
        int pointerB = b.length() - 1;
        int carry = 0;
        while (pointerA >= 0 && pointerB >= 0) {
            int d = carry + (a.charAt(pointerA) - '0') + (b.charAt(pointerB) - '0');
            carry = d >= 2 ? 1 : 0;
            result.append(String.valueOf(d % 2));
            pointerA--;
            pointerB--;
        }
        while (pointerA >= 0) {
            int d = carry + (a.charAt(pointerA) - '0');
            carry = d >= 2 ? 1 : 0;
            result.append(String.valueOf(d % 2));
            pointerA--;
        }
        while (pointerB >= 0) {
            int d = carry + (b.charAt(pointerB) - '0');
            carry = d >= 2 ? 1 : 0;
            result.append(String.valueOf(d % 2));
            pointerB--;
        }
        if (carry == 1) {
            result.append("1");
        }
        return result.reverse().toString();
    }
}
