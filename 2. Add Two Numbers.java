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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remaining = 0;
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null && l2 != null) {
            int val = remaining + l1.val + l2.val;

            if (val < 10) {
                result.next = new ListNode(val);
                remaining = 0;
            }
            else{
                remaining = val / 10;
                result.next = new ListNode(val % 10);
            }
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int val = remaining + l1.val;
            if (val < 10) {
                result.next = new ListNode(val);
                remaining = 0;
            }
            else{
                remaining = val / 10;
                result.next = new ListNode(val % 10);
            }
            result = result.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int val = remaining + l2.val;
            if (val < 10) {
                result.next = new ListNode(val);
                remaining = 0;
            }
            else{
                remaining = val / 10;
                result.next = new ListNode(val % 10);
            }
            result = result.next;
            l2 = l2.next;
        }
        
        if (remaining > 0) {
            result.next = new ListNode(remaining);
            result = result.next;
        }
        result.next = null;
        return head.next;
    }
}
