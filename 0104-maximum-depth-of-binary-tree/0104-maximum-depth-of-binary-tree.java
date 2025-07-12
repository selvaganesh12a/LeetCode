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
    int ans = 0;
    public int maxDepth(TreeNode root) {
        solve(root,0);
        if(root == null) return 0;
        return ans+1;
    }

    public void solve(TreeNode root,int c){
        if(root == null) return;

        solve(root.left,c+1);
        ans = Math.max(ans,c);
        solve(root.right,c+1);
    }
}