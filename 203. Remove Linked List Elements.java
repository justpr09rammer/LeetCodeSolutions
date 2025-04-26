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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode dummy1 = head; 
        ListNode dummy2 = dummy;

        while (dummy1 != null) {
            if (dummy1.val != val) {
                dummy2.next = dummy1;
                dummy2 = dummy2.next;
            }
            dummy1 = dummy1.next;
        }

        dummy2.next = null;
        return dummy.next;
    }
}
203. Remove Linked List Elements
