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
    public int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        int max = Integer.MIN_VALUE;
        int level = 0;
        int ans = 0;
        while(queue.size() > 0){
            int count = queue.size();
            level++;
            int sum = 0;
            for(int i=0; i<count; i++){
                root = queue.remove();
                sum = sum + root.val;
                
                if(root.left != null){
                    queue.add(root.left);
                }
                if(root.right != null){
                    queue.add(root.right);
                }
            }
            if(max < sum){
                max = sum;
                ans = level;
            }
        }
        return ans;
        
    }
}