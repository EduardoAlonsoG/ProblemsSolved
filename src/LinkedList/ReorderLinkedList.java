package LinkedList;

import java.util.ArrayList;
import java.util.List;

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

class ReorderLinkedList {
    public void reorderList(ListNode head) {
        ListNode tail = head;
        ListNode hl = head;
        //ListNode hr = tail;
        List<ListNode> hrList = new ArrayList<>();
        while(tail != null){
            if(tail.next == null)
                break;
            else{
                //hr = tail;
                hrList.add(tail);
                tail = tail.next;
            }
        }
        int inxCount = 0;
        while(head != null){
            if(inxCount % 2 != 0){
                //swap the nodes
                //swapNodes(head , hl , tail , hr);
                swapNodes(head , hl , tail , hrList.get(hrList.size() - inxCount) );
            }
            printLnkedList(head);
            inxCount++;
            hl = head;
            head = head.next;
        }
    }

    private void printLnkedList(ListNode head){
        System.out.println("Iteracion: \n");
        while(head != null){
            System.out.print(head.val  + " -> ");
            head = head.next;
        }
    }

    public void swapNodes(ListNode head , ListNode hl , ListNode tail , ListNode hr){
        //System.out.println("Datos modificacion: ");
        //System.out.println(hl.val + " -> " + head.val + " | " +hr.val + " -> " + tail.val);

        /*tail.next = head;
        hl.next = tail;
        hr.next = null;
        tail = hr;*/
        tail.next = head;
        hl.next = tail;
        hr.next = null;

        tail = hl.next;
    }
}

/*
head=[2,4,6,8,10]
*/


/*
Reorder Linked List
You are given the head of a singly linked-list.

The positions of a linked list of length = 7 for example, can intially be represented as:

[0, 1, 2, 3, 4, 5, 6]

Reorder the nodes of the linked list to be in the following order:

[0, 6, 1, 5, 2, 4, 3]

Notice that in the general case for a list of length = n the nodes are reordered to be in the following order:

[0, n-1, 1, n-2, 2, n-3, ...]

You may not modify the values in the list's nodes, but instead you must reorder the nodes themselves.

Example 1:

Input: head = [2,4,6,8]

Output: [2,8,4,6]
Example 2:

Input: head = [2,4,6,8,10]

Output: [2,10,4,8,6]
Constraints:

1 <= Length of the list <= 1000.
1 <= Node.val <= 1000

*/
