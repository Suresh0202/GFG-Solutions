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
    public void func(Node root,int p,int q,List<Integer>a,List<List<Integer>>ans)
    {
        if(root == null)
        {
            return;
        }
        if(root.data == p)
        {
            a.add(root.data);
            ans.add(new ArrayList<>(a));
            a.remove(a.size()-1);
            // return ;
        }
        if(root.data == q)
        {
            a.add(root.data);
            ans.add(new ArrayList<>(a));
            a.remove(a.size()-1);
            // return;
        }
        if(root.left != null)
        {
        a.add(root.data);
        func(root.left,p,q,a,ans);
        a.remove(a.size()-1);

        }
        if(root . right != null)
        {
          

        a.add(root.data);
        func(root.right,p,q,a,ans);
        a.remove(a.size()-1);

        }
    }
    Node lca(Node root, int p, int q) {
        // code here
         List<List<Integer>>ans=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        func(root,p,q,a,ans);
        // System.out.println(ans);
        List<Integer>p1=ans.get(0);
        List<Integer>p2=ans.get(1);
        int i=0;
        int j=0;
        int f=0;
        while(i<p1.size() && j<p2.size())
        {
            i++;
            j++;
            if(i<p1.size() && j<p2.size() &&!p1.get(i).equals(p2.get(j)))
            {
            //   /
                break;
            }
        }
        if(i == j)
        {
            return new Node(p1.get(i-1));
        }
        if(i == p1.size()-1)
        {
            return new Node(p2.get(j-1));
        }
        if(j == p2.size()-1)
        {
            return new Node(p1.get(i-1));
        }
        return null;
        
    }
}