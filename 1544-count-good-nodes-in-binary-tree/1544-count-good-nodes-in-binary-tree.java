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
    int ans = 1;
    public int goodNodes(TreeNode root) {
        solve(root.left,root.val);
        solve(root.right,root.val);
        return ans;
    }

    public void solve(TreeNode root,int max){
        if(root == null) return;
        if(root.val >= max) ans++;
        solve(root.left,Math.max(max,root.val));
        solve(root.right,Math.max(max,root.val));
    }
}