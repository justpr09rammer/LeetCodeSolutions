class Solution {
    public String resultingString(String s) {
        Stack<Character> stack = new Stack<>();
        int leftPointer = 0;
        while (leftPointer < s.length()) {
            if (stack.isEmpty()) {
                stack.add(s.charAt(leftPointer));
            } else {
                char ch = s.charAt(leftPointer);
                char top = stack.peek();
                if (Math.abs(ch - top) == 1 || (ch == 'z' && top == 'a') || (ch == 'a' && top == 'z')) {
                    stack.pop();
                } else {
                    stack.add(ch);
                }
            }
            leftPointer++;
        }
        int stackSize = stack.size();
        char[] result = new char[stackSize];
        int i = stackSize - 1;
        while (!stack.isEmpty()) {
            result[i--] = stack.pop();
        }
        return new String(result);
    }
}
