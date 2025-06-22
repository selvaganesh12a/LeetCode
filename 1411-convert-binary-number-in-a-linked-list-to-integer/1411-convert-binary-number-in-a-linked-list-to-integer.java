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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int ans = 0,len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        temp = head;
        len -= 1;
        while(temp != null){
            ans += (int)(temp.val * (int)(Math.pow(2,len--)));
            temp = temp.next;
        }
        return ans;
    }
}