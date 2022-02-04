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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(root.val == targetSum){
                return true;
            }
            else{
                return false;
            }
        }
        boolean[] arr = new boolean[1];
        helper(root, targetSum, 0, arr);
        return arr[0];
    }
    
    void helper(TreeNode root, int S, int sum, boolean[] arr){
        if(root == null) return;
        if(root.left == null && root.right == null){
            sum = sum + root.val;
            if(sum == S){
                arr[0] = true;
                return;
            }
            else{
                sum = sum - root.val;
                return;
            }
        }
        sum = sum + root.val;
        helper(root.left, S, sum,arr);
        helper(root.right, S, sum,arr);
        sum = sum - root.val;
    }
}