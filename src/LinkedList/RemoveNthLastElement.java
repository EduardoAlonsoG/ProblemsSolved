package LinkedList;

public class RemoveNthLastElement {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0 , head);
        ListNode left = newHead;
        ListNode right = head;
        while(n > 0){
            right = right.next;
            n--;
        }

        while(right != null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return newHead.next;
    }

}
