/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            if(!list.contains(temp.next)) list.add(temp.next);
            else return true;
            temp = temp.next;
        }
        return false;
    }
}