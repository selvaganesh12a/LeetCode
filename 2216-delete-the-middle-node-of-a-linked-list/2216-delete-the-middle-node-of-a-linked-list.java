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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int mid = len/2;
        temp = head;
        int pos = 0;
        ListNode prev = temp;
        while(pos != mid){
            pos++;
            prev = temp;
            temp = temp.next;
        }
        if(temp == head && prev == head){
            head = head.next;
            return head;
        }
        prev.next = temp.next;
        return head;
    }
}