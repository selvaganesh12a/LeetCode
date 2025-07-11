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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> temp = new ArrayList<>();
        if(root == null) return temp;
        temp.addAll(inorderTraversal(root.left));
        temp.add(root.val);
        temp.addAll(inorderTraversal(root.right));
        return temp;
    }
}