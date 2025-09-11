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
    public void func(ArrayList<Integer>ans,Node root)
    {
        if(root == null)
        {
            return;
        }
        func(ans,root.left);
        ans.add(root.data);
        func(ans,root.right);
    }
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList<Integer>ans=new ArrayList<>();
        func(ans,root1);
        ArrayList<Integer>ans1=new ArrayList<>();
        func(ans1,root2);
        // System.out.println(ans+ "  " + ans1);
         ArrayList<Integer>ans3=new ArrayList<>();
         int i=0;
         int j=0;
        
         while(i<ans.size() && j < ans1.size())
         {
             if(ans.get(i)<ans1.get(j))
             {
                 ans3.add(ans.get(i));
                 i++;
                //  j++;
             }else
             {
                 ans3.add(ans1.get(j));
                 j++;
                 
             }
         }
         while(i<ans.size())
         {
             ans3.add(ans.get(i));
             i++;
         }
         while(j<ans1.size())
         {
             ans3.add(ans1.get(j));
             j++;
         }
        return ans3;
        
    }
}