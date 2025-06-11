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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = list1;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        temp = list2;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        System.out.println(list);

        ListNode ans = new ListNode();
        for(int i = 0; i < list.size(); i++){
            insert(list.get(i), ans);
        }
        return ans.next;
    }

    void insert(int val, ListNode temp){
        ListNode newNode = new ListNode(val);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}