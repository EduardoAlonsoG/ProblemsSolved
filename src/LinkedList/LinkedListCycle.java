package LinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        //pending to add test cases
    }
}
class SolutionLLCy{
    public boolean hasCycle(ListNode head) {

        ListNode slowP = head;
        ListNode fastP = head;

        while(fastP != null && fastP.next != null){
            slowP = slowP.next;
            fastP = fastP.next.next;
            if(slowP == fastP)
                return true;
        }

        return false;

        /*Set<ListNode> visitedNodes = new HashSet<>();
        while (head != null){
            if(visitedNodes.contains(head))
                return true;
            visitedNodes.add(head);
            head = head.next;
        }
        return false;*/
    }
}
