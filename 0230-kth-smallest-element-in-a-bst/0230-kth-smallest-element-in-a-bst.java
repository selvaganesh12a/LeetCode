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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = traverse(root);
        return list.get(k - 1);
    }

    public ArrayList<Integer> traverse(TreeNode root){
        if(root == null) return new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(traverse(root.left));
        temp.add(root.val);
        temp.addAll(traverse(root.right));

        return temp;
    }
}