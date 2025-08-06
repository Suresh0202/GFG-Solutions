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
    public static void traversal(Node temp,int max[])
    {
        if(temp == null)
        {
            return;
        }
        if(isBst(temp))
        {
            max[0]=Math.max(max[0],findHeight(temp,new int[1]));
        }
        traversal(temp.left,max);
        traversal(temp.right,max);
    }
    public static int findHeight(Node temp,int ans[])
    {
        if(temp == null)
        {
            return 0;
        }
        ans[0]++;
        findHeight(temp.left,ans);
        findHeight(temp.right,ans);
        return ans[0];
        
    }
    public static boolean isBst(Node temp)
    {
       List<Integer>bst=new ArrayList<>();
       inorder(bst,temp);
       if(isSorted(bst))
       {
           return true;
       }
       return false;
    }
    public static void inorder(List<Integer>bst,Node temp)
    {
        if(temp == null)
        {
            return;
        }
        inorder(bst,temp.left);
        bst.add(temp.data);
        inorder(bst,temp.right);
    }
    public static boolean isSorted(List<Integer>arr)
    {
        if(arr.size() == 1)
        {
            return true;
        }
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i) <= arr.get(i-1))
            {
                return false;
            }
        }
        return true;
    }   
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        // Write your code here
        int ans=0;
        Node temp=root;
        int max[]={1};
        traversal(temp,max);
        return max[0];
    }
}