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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int len = 0, idx = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int extra = len%k;
        int base = len/k;

        temp = head;
        int size = 0;
        while(temp != null){
            if(extra > 0){
                ListNode st = temp;
                while(size < base){
                    size++;
                    temp = temp.next;
                }
                size = 0;
                extra--;
                ListNode t = temp;
                temp = temp.next;
                t.next = null;
                ans[idx++] = st;
            }else{
                ListNode st = temp;
                while(size < base-1){
                    size++;
                    temp = temp.next;
                }
                size = 0;
                ListNode t = temp;
                temp = temp.next;
                t.next = null;
                ans[idx++] = st;
            }
        }
        return ans;
    }
}