/*
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
*/

class Solution {
    public boolean ifLeaf(Node curr)
    {
        if(curr.left == null && curr.right == null)
        {
            return true;
        }
        return false;
    }   
    public void inorder(ArrayList<Integer>ans,Node root)
    {
        if(root == null)
        {
            return;
        }
        if(ifLeaf(root))
        {
            ans.add(root.data);
        }
        inorder(ans,root.left);
        inorder(ans,root.right);
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        Node curr=root;
        if(!ifLeaf(curr))
        {
            ans.add(curr.data);
        }
        // ans.add(curr.data);
        curr=curr.left;
        while( curr != null && !ifLeaf(curr))
        {
            if(curr.left != null)
            {
                ans.add(curr.data);
                curr= curr.left;
            }
            else if(curr.left ==  null && curr.right != null)
            {
                ans.add(curr.data);
                curr=curr.right;
            }
        }
        // System.out.println(ans);
        inorder(ans,root);
        curr=root;
        curr=curr.right;
        Stack<Integer>st=new Stack<>();
        while( curr != null && !ifLeaf(curr))
        {
            if(curr.right != null)
            {
                st.push(curr.data);
                curr=curr.right;
            }else if(curr.right == null && curr.left != null)
            {
                st.push(curr.data);
                curr=curr.left;
            }
        }
        // System.out.println(ans);
        while(!st.isEmpty())
        {
            ans.add(st.pop());
        }
        
        // ans.remove(ans.size()-1);
        return ans;
        
    }
}