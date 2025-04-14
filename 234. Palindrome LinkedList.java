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
    //kinda global variable
    private boolean isEvenLength = true;
    // for the odd length linked listss
    private ListNode beforeMiddle = null;
    public boolean isPalindrome(ListNode head) {

        if (head.next == null){
            return true;
        }


        ListNode middle = findMiddleNode(head);
        ListNode head2;
        beforeMiddle.next = null;
        //for odd length
        if (!isEvenLength){
            head2 = middle.next;
        }
        //for even length
        else {
            head2 = middle;
        }
        head2 = reverse(head2);
        while (head!= null && head2 != null){
            if (head.val != head2.val){
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;

    }
    private ListNode findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            beforeMiddle = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            isEvenLength = false;
        }
        return slow;
    }
    private ListNode reverse(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }


}
