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
}*/

class Solution {
    public Node func(Node root,int n1,int n2)
    {
        if(root == null || root.data == n1 || root.data == n2)
        {
            return root;
        }
        Node left=func(root.left,n1,n2);
        Node right=func(root.right,n1,n2);
        if(left == null)
        {
            return right;
        }
        if(right == null)
        {
            return left;
        }
        return root;
    }
    Node lca(Node root, int n1, int n2) {
        // code here
        return func(root,n1,n2);
    }
}