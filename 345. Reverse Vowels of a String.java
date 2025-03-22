
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        char[] result = s.toCharArray();
        while (leftPointer < rightPointer){
            if (set.contains(s.charAt(leftPointer)) && set.contains(s.charAt(rightPointer))){
                char temp = s.charAt(leftPointer);
                result[leftPointer] = s.charAt(rightPointer);
                result[rightPointer] = temp;
                leftPointer ++;
                rightPointer --;
            }
            else if (set.contains(s.charAt(rightPointer))){
                leftPointer ++;
            }
            else if (set.contains(s.charAt(leftPointer))){
                rightPointer --;
            }
            else{
                leftPointer++;
                rightPointer--;
            }
        }
        return new String(result);
    }
}
