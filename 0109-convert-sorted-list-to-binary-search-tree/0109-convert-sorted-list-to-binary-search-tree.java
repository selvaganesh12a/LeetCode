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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        traversal(head,list);
        return solve(list,0,list.size() - 1);
    }

    public void traversal(ListNode head,ArrayList<Integer> list){
        if(head == null) return;
        list.add(head.val);
        traversal(head.next,list);
    }

    public TreeNode solve(ArrayList<Integer> list,int s, int e){
        if(s > e) return null;

        int m = s + (e - s)/2;
        TreeNode root = new TreeNode(list.get(m));
        root.left = solve(list,s,m - 1);
        root.right = solve(list,m+1,e);

        return root;
    }
}