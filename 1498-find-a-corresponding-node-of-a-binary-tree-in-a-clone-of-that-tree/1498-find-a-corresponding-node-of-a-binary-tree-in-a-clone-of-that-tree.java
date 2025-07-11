/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned == null) return null;
        if(cloned.val == target.val) return cloned;
        TreeNode temp = getTargetCopy(original,cloned.left,target);
        if(temp == null){
            TreeNode temp2 = getTargetCopy(original,cloned.right,target);
            if(temp2 == null) return null;
            else return temp2;
        }else return temp;
    }
}