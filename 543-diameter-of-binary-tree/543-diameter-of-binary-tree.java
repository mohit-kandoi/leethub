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
    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int ans = solve(root);
        return result-1;
    }
    public int solve(TreeNode node){
        if(node == null) return 0;
        
        int left = solve(node.left);
        int right = solve(node.right);
        
        int temp = Math.max(left,right)+1;
        int ans = Math.max(temp, left+right+1);
        
        result = Math.max(result, ans);
        
        return temp;
        
    }
}