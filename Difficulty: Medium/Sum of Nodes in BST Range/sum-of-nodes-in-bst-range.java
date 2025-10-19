/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public void func(Node root,int sum[],int l,int r)
    {
        if(root == null)return;
        func(root.left,sum,l,r);
        if(root.data >=l && root.data <=r)
        {
            sum[0]+=root.data;
        }
        func(root.right,sum,l,r);
    }
    public int nodeSum(Node root, int l, int r) {
        // code here
        // ArrayList<Integer>ar=new ArrayList<>();
        int sum[]=new int[1];
        func(root,sum,l,r);
        return sum[0];
    }
}
