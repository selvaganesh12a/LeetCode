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
        s(root);
        return temp.right;
    }

    // public void solve(TreeNode root, TreeNode ans) {
    //     if(root == null) return;
    //     if(ans == null)
    //         solve(root.left,ans);
    //     else 
    //         solve(root.left,ans.right);
    //     System.out.println(root.val);
    //     if(root == null) return;
    //     ans.right = new TreeNode(root.val);
    //     solve(root.right,ans.right);
    // }

    public void s(TreeNode r) {
        if (r == null)
            return;
        s(r.left);
        ans.right = r;
        ans = ans.right;
        ans.left = null;
        s(r.right);
    }
}