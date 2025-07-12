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
    TreeNode ans;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode temp = new TreeNode();
        this.ans = temp;
        solve(root);
        return temp.right;
    }

    public void solve(TreeNode root) {
        if(root == null) return;
        solve(root.left);
        //System.out.println(root.val);
        ans.right = new TreeNode(root.val);
        ans.left = null;
        ans = ans.right;
        solve(root.right);
    }

    // public void s(TreeNode r) {
    //     if (r == null)
    //         return;
    //     s(r.left);
    //     ans.right = r;
    //     ans = ans.right;
    //     ans.left = null;
    //     s(r.right);
    // }
}