
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int n = findLength(head);
        if (n == 1){
            return null;
        }
        if (n == 2){
            head.next = null;
            return head;
        }
        int middle = n / 2;
        ListNode previousNode = head;
        ListNode currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (index == middle) {
                previousNode.next = currentNode.next;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            index ++;
        }
        return head;
    }
    public int findLength(ListNode head){
        int length = 0;
        while (head != null){
            length++;
            head = head.next;
        }
        return length;
    }
}
