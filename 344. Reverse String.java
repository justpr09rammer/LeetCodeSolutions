
class Solution {
    public void reverseString(char[] s) {
        func(0, s.length - 1, s);
        System.out.println(s);
    }
    private void func(int left, int right, char[] s){
        if (left > right){
            return ;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        func(left+1, right - 1, s);
    }
}
