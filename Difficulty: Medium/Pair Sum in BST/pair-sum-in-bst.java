/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    void inorder(Node root,ArrayList<Integer>st)
    {
        if(root == null)
        {
            return ;
        }
        inorder(root.left,st);
        st.add(root.data);
        inorder(root.right,st);
    }
    boolean findTarget(Node root, int target) {
        // Write your code here
        ArrayList<Integer>st=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        inorder(root,st);
       for(int i=0;i<st.size();i++)
       {
           int k=target-st.get(i);
           if(mp.containsKey(k))
           {
               return true;
           }
           mp.put(st.get(i),i);
       }
        return false;
    }
}