// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    int res=-1;
    int cnt=0;
    public void func(Node root,int k)
    {
        if(root == null)
        {
            return ;
        }
        func(root.left,k);
        cnt++;
        if(cnt == k)
        {
            res=root.data;
            return;
        }
        // arr.add(root.data);
        func(root.right,k);
    }
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        if(root == null)
        {
            return -1;
        }
        // List<Integer>arr=new ArrayList<>();
        func(root,k);
        return res;
    }
}