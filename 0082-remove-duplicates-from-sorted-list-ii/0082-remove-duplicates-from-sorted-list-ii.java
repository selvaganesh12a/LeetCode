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
        ListNode newNode  = new ListNode(0,head);
        ListNode prev = newNode;
        ListNode curr = head;
        while(curr!=null  && curr.next != null){
            if(curr.val == curr.next.val){
                while( curr!=null && curr.next!=null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                prev.next = curr.next;
                curr = curr.next;
            }else{
                curr = curr.next;
                prev = prev.next;
            } 
            
        }
        return newNode.next;
    }
}