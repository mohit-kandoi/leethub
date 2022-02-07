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
    int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        solve(root);
        return sum;
    }
    
    int solve(TreeNode node){
        if(node == null){
            return 0;
        }
        int ls = solve(node.left);
        int rs = solve(node.right);
        
        
        int tempAns = Math.max(Math.max(ls,rs)+node.val, node.val);
        int ans = Math.max(tempAns,ls+rs+node.val);
        // int res = Math.max(ans,node.val);
        
        sum = Math.max(ans, sum);
        
        return tempAns;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}