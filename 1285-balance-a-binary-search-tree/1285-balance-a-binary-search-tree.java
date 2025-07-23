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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        traversal(root,list);
        return solve(list,0,list.size() - 1);
    }

    public void traversal(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;

        traversal(root.left,list);
        list.add(root.val);
        traversal(root.right,list);
    }

    public TreeNode solve(ArrayList<Integer> list, int s, int e){
        if(s > e) return null;

        int m = s + (e-s)/2;
        TreeNode root = new TreeNode(list.get(m));
        root.left = solve(list,s,m-1);
        root.right = solve(list,m+1,e);

        return root;
    }

}