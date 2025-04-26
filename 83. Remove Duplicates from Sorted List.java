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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummy1 = head;
        ListNode dummy2 = head.next;
        while (dummy2 != null) {
            if (dummy1.val != dummy2.val) {
                dummy1.next = dummy2;
                dummy1 = dummy1.next;
            }
            dummy2 = dummy2.next;
        }
        dummy1.next = null;
        return head;
    }
}83. Remove Duplicates from Sorted List
