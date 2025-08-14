/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static void func(Node root,ArrayList<Integer>a,ArrayList<ArrayList<Integer>>ans)
    {
        if(root.left == null && root.right == null)
        {
            a.add(root.data);
            ans.add(new ArrayList<>(a));
            a.remove(a.size()-1);
            return;
        }
        if(root == null)
        {
            return ;
        }
        
        if(root.left != null)
        {
        a.add(root.data);
        func(root.left,a,ans);
        a.remove(a.size()-1);
        }
        if(root.right != null)
        {
        a.add(root.data);
        func(root.right,a,ans);
        a.remove(a.size()-1);
}
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        
    ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    ArrayList<Integer>a=new ArrayList<>();
    func(root,a,ans);
    return ans;




    }
}