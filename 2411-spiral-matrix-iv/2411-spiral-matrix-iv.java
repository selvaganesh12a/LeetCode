/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        ListNode temp = head;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] = -1;
            }
        }

        int t = 0, b = m - 1, l = 0, r = n - 1;
        while(t <= b && l <= r){
            for(int i = l; i <= r; i++){
                if(temp == null){
                    return ans;
                }
                ans[t][i] = temp.val;
                temp = temp.next;
            }
            t++;

            for(int i = t; i <= b; i++){
                if(temp == null){
                    return ans;
                }
                ans[i][r] = temp.val;
                temp = temp.next;
            }
            r--;

            if(t <= b){
                for(int i = r; i >= l; i--){
                    if(temp == null){
                        return ans;
                    }
                    ans[b][i] = temp.val;
                    temp = temp.next;
                }
                b--;
            }

            if(l <= r){
                for (int i = b; i >= t; i--) {
                    if(temp == null){
                        return ans;
                    }
                    ans[i][l] = temp.val;
                    temp = temp.next;
                }
                l++;
            }
        }
        return ans;
    }
}