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
    public ListNode swapPairs(ListNode head) {
        ListNode newNode = new ListNode();
        ListNode n = newNode;
        ListNode temp = head;
        if(head == null) return head;
        if(head.next == null) return head;
        while(temp!=null && temp.next!=null){
            n.next = temp.next;
            temp.next = temp.next.next;
            n.next.next = temp;
            n = temp;
            temp = temp.next;
        }
        return newNode.next;
    }
}