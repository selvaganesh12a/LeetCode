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
    int maxlevel = -1;
    TreeNode ans;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        find(root, 0);
        return ans;
    }

    public int find(TreeNode root, int level){
        if(root == null) return level;

        int left = find(root.left,level+1);
        int right = find(root.right,level+1);

        maxlevel = Math.max(maxlevel,Math.max(left,right));

        if(left == right && maxlevel == left){
            ans = root;
        }
        return Math.max(left,right);
    }
}