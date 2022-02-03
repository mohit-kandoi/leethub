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
class Pair{
    TreeNode node;
    int state;
    Pair(TreeNode node, int state){
        this.node = node;
        this.state = state;
    }
}
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        if(root == null){
            return list;
        }
        Pair rtp = new Pair(root, 1);
        st.push(rtp);
        
        while(st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                list.add(top.node.val);
                top.state++;
                
                if(top.node.left != null){
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }
            }
            else if(top.state == 2){
                top.state++;
                
                if(top.node.right != null){
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }
            }
            else{
                st.pop();
            }
        }
        return list;
        
    }
}