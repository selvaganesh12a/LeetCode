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
    public int minimumOperations(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < len; i++){
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            ans += find(list);
        }
        return ans;
    }

    public int find(ArrayList<Integer> list){
        int swap = 0;
        boolean[] vis = new boolean[list.size()];
        ArrayList<Integer> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++) map.put(sorted.get(i),i);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == sorted.get(i) || vis[i]) continue;
            else{
                int j = i;
                int cycle = 0;
                while(!vis[j]){
                    vis[j] = true;
                    j = map.get(list.get(j));
                    cycle++;
                }
                swap += cycle-1;
            }
        }    
        return swap;
    }
}