package LeetCode;

import java.util.*;
class Solution {
    public String reverseWords(String s) {
        int leftPointer = 0;
        List<StringBuilder> list = new ArrayList<>();
        boolean wordHasStarted = false;
        StringBuilder sb = new StringBuilder();
        while (leftPointer < s.length()) {
            if (!wordHasStarted && s.charAt(leftPointer) == ' ') {
                leftPointer ++;
                continue;
            }
            else {
                if (!wordHasStarted && s.charAt(leftPointer) != ' ') {
                    wordHasStarted = true;
                    sb.append(s.charAt(leftPointer));
                }
                else if(wordHasStarted && s.charAt(leftPointer) != ' ') {
                    sb.append(s.charAt(leftPointer));
                }
                else if(wordHasStarted && s.charAt(leftPointer) == ' ') {
                    wordHasStarted = false;
                    list.add(sb);
                    System.out.println(sb.toString());
                    sb = new StringBuilder();
                }
            }

            leftPointer ++;
        }
        if (wordHasStarted){
            System.out.println(sb.toString());
            list.add(sb);
        }
        Collections.reverse(list);
        StringBuilder result = new StringBuilder();
        for (StringBuilder word : list) {
            result.append(word).append(" ");
        }
        if (result.charAt(result.length() - 1) == ' ') {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }
}
