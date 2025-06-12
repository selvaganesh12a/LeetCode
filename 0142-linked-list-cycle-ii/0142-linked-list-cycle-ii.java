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
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            if(!list.contains(temp)){
                list.add(temp);
            }else return temp;
            temp = temp.next;
        }
        return null;
    }
}