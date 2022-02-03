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
       
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root == null) return ans;
        helper(root, ans, "");
        return ans;
    } 
    void helper(TreeNode root, List<String> ans, String asf){
        if(root == null) return;
        if(root.left == null && root.right == null){
            asf += root.val;
            ans.add(asf);
        }
        asf += root.val + "->";
        helper(root.left,ans,asf);
        helper(root.right, ans, asf);
        asf = asf.substring(0, asf.length()-3);
        
    }
}