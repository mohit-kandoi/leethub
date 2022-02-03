// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException
    {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            Solution T = new Solution();
            int target = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = T.KDistanceNodes(root,target,k);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
            t--;
        }
    }
}
// } Driver Code Ends

class Solution
{
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        list = new ArrayList<>();
        find(root, target);
        
        ans = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            kDown(list.get(i), k-i, i==0 ? null : list.get(i-1));
        }
        Collections.sort(ans);
        return ans;
    }
    
    //K level Down:
    static ArrayList<Integer> ans;
    public static void kDown(Node node, int k, Node blocker){
        if(node == null || k<0 || node == blocker){
            return;
        }
        if(k==0){
            ans.add(node.data);
        }
        kDown(node.left, k-1, blocker);
        kDown(node.right, k-1, blocker);
    }
    
    //Node to Root Path Printing:
    static ArrayList<Node> list;
    public static boolean find(Node node, int data){
        if(node == null){
            return false;
        }
        if(node.data == data){
            list.add(node);
            return true;
        }
        boolean findInLeft = find(node.left, data);
        if (findInLeft){
            list.add(node);
            return true;
        }

        boolean findInRight = find(node.right,data);
        if (findInRight){
            list.add(node);
            return true;
        }

        return false;
    }
};