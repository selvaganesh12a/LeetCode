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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        ans.addAll(traverse(root1));
        ans.addAll(traverse(root2));
        Collections.sort(ans);
        return ans;
    }

    public List<Integer> traverse(TreeNode root){
        if(root == null) return new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(traverse(root.left));
        temp.add(root.val);
        temp.addAll(traverse(root.right));
        return temp;
    }
}