/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int rightPointer = list.size() - 1;
        int leftPointer = 0;
        while (leftPointer < rightPointer) {
            if (!list.get(leftPointer).equals(list.get(rightPointer))) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
