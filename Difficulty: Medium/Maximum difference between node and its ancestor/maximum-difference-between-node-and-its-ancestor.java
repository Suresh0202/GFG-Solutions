/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
        int dfs(Node root , int max){
        if(root==null)return Integer.MIN_VALUE;

        int left = dfs(root.left, Math.max(max,root.data));
        int right = dfs(root.right, Math.max(max,root.data));
        
        
        int diff = Math.max(left,max-root.data);
        diff= Math.max(right,diff);
        
        return diff;
    }
    int maxDiff(Node root) {
        //  code here
          int left = dfs(root.left,root.data);
        int right = dfs(root.right,root.data);
        
        
        
        return Math.max(left,right) ;
        
    }
}