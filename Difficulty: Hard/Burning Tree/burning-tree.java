/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}  */
class Pair{
    Node root;
    int dis;
    Pair(Node root,int dis)
    {
        this.dis=dis;
        this.root=root;
    }
}
class Solution {
    public static void parentmap(Node root,HashMap<Node,Node>mp)
    {
        if(root == null)
        {
            return;
        }
        if(root.left != null)
        {
            mp.put(root.left,root);
            parentmap(root.left,mp);
        }
        if(root.right != null)
        {
            mp.put(root.right,root);
            parentmap(root.right,mp);
        }
        
    }
    public static Node find(Node root,int tar)
    {
        if(root == null)
        {
            return root;
        }
        if(root.data == tar)
        {return root;
        }
        Node left = find(root.left, tar);
        if (left != null) return left;
        return find(root.right, tar);

    }
    public static int minTime(Node root, int target) {
        // code here
        HashMap<Node,Node>par=new HashMap<>();
        par.put(root,null);
        parentmap(root,par);
        Node ini=find(root,target);
        if(ini == null)
        {
            return 0;
        }
        Queue<Pair>qu=new LinkedList<>();
        qu.add(new Pair(ini,0));
        int cnt=-1;
        HashSet<Node>st=new HashSet<>();
        st.add(ini);
        while(!qu.isEmpty())
        
        {
            cnt++;
            int n=qu.size();
            for(int i=0;i<n;i++)
            {
            Pair p=qu.poll();
            Node x=p.root;
            int dist=p.dis;
                if(x.left != null && !st.contains(x.left))
                {
                    qu.add(new Pair(x.left,dist+1));
                    st.add(x.left);
                }
                if(x.right != null && !st.contains(x.right))
                {
                    qu.add(new Pair(x.right,dist+1));
                    st.add(x.right);
                }
                Node parent = par.get(x);
                if (parent != null && !st.contains(parent)) {
                    qu.add(new Pair(parent, p.dis + 1));
                    st.add(parent);
                }

            }
        }
        return cnt;
        
    }
}