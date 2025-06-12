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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = null;
        ListNode end = null;
        ListNode temp = list1;
        int idx = 0;
        while(temp != null){
            if(idx == a) start = temp;
            if(idx - 1 == b) end = temp;
            idx++;
            temp = temp.next;
        }

        ListNode ans = list1;
        idx = 0;
        while(list1 != null){
            if(idx + 1 == a){
                list1.next = list2;
                while(list1.next != null){
                    list1 = list1.next;
                }
                list1.next = end;
                break;
            }
            idx++;
            list1 = list1.next;
        }
        return ans;
    }
}