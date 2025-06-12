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
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size = set.size();
            set.add(temp);
            if(size == set.size()){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}