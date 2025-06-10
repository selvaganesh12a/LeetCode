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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        int a = 0, b = 0, idx = 0;
        ListNode temp = head;
        while(temp.next != null){
            int ans = gcd(temp.val,temp.next.val);
            ListNode newNode = new ListNode(ans);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }
        return head;
    }

    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b,a % b);
    }
}