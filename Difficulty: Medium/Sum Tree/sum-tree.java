/* A Binary Tree node
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
    void findsum(Node root,int ans[])
    {
        if(root == null)
        {
            return ;
        }
        ans[0]+=root.data;
        findsum(root.left,ans);
        findsum(root.right,ans);
    }
    public boolean isleaf(Node root)
    {
        return root.left == null && root.right == null;
    }
    boolean find(Node root)
    {
        if(root == null)
        {
            return true;
        }
        int Lsum[]=new int[1];
        // if(!isleaf(root.left))
        {
        findsum(root.left,Lsum);
        }
        int Rsum[]=new int[1];
        // if(!isleaf(root.right))
        {
        findsum(root.right,Rsum);
            // 
        }
        // System.out.println(Lsum[0] + " " + Rsum[0] +" " + root.data);
        if((Lsum[0] + Rsum[0]) != root.data)
        {
            return false;
        }
        boolean a=false;
        boolean b=false;
        if(isleaf(root))
        {
            return true;
            // a=find(root.left);
        }
        if(isleaf(root.right))
        {
            return true;
            
        }
        
        return  find(root.left) && find(root.right);
    }
    boolean isSumTree(Node root) {
        Node temp=root;
        // Your code here
        return find(temp);
        
    }
}