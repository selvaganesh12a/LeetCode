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
    public boolean isPalindrome(ListNode head) {
        String s = "";
        ListNode temp = head;
        while(temp != null){
            s += String.valueOf(temp.val);
            temp = temp.next;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString()) ? true : false;
    }
}