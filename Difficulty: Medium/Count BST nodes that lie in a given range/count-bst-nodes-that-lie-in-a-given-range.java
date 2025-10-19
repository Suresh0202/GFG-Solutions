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
    public void func(Node root,int sum[],int l,int h)
    {
        if(root == null)return;
        func(root.left,sum,l,h);
        if(root.data >=l && root.data <=h)
        {
            sum[0]+=1;
        }
        func(root.right,sum,l,h);
    }
    int getCount(Node root, int l, int h) {
        // Your code here
        int sum[]=new int[1];
        func(root,sum,l,h);
        return sum[0];
    }
}