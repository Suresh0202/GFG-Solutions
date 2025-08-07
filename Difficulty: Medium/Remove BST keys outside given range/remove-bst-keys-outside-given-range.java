// User function Template for Java

/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    public Node insert(Node root,int ele)
    {
        if(root == null)
        {
            return new Node(ele);
        }
        if(ele < root.data)
        {
            root.left=insert(root.left,ele);
        }else
        {
            root.right=insert(root.right,ele);
        }
        return root;
    }
    public void func(Node root,int l,int r,Node temp,Set<Integer>st)
    {
        if(root == null)
        {
            return ;
        }
        if(root.data >=l && root.data <= r)
        {
            // temp=insert(temp,root.data);
            // print(temp);
            st.add(root.data);
        }
        func(root.left,l,r,temp,st);
        func(root.right,l,r,temp,st);
    }
  
    Node removekeys(Node root, int l, int r) {
        // code here
        Node temp=null;
        HashSet<Integer>st=new HashSet<>();
        func(root,l,r,temp,st);
        // print(temp);
        // System.out.println(st);
        for(int i:st)
        {
            temp=insert(temp,i);
        }
        return temp;
    }
}