// class Node
// {
//     int data;
//     Node left, right;
// }

class Pair{
    Node root;
    int dist;
    Pair(Node root,int dist)
    {
        this.root=root;
        this.dist=dist;
    }
}
class Solution {
     public static Node findNode(Node root,int target)
    {
        if(root == null)
        {
            return root;
        }
        if(root.data == target)
        {
            return root;
        }
        Node left=findNode(root.left,target);
        Node right=findNode(root.right,target);
        if(left != null)
        {
            return left;
        }
        return right;
    }
     public static void func(Node root,HashMap<Node,Node>mp)
    {
        if(root == null)
        {
            return;
        }
        if(root.left != null)
        {
            mp.put(root.left,root);
            func(root.left,mp);
        }
        if(root.right != null)
        {
            mp.put(root.right,root);
            func(root.right,mp);
        }
        
    }
    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        // return the sorted list of all nodes at k dist
        HashMap<Node,Node>mp=new HashMap<>();
        //stop
        // /continue
        
        mp.put(null,root);
        func(root,mp);
        Node find=findNode(root,target);
        Queue<Pair>qu=new LinkedList<>();
        qu.add(new Pair(find,0));
        HashSet<Node>st=new HashSet<>();
        ArrayList<Integer>ans=new ArrayList<>();
        while(!qu.isEmpty())
        {
            int n=qu.size();
            for(int i=0;i<n;i++)
            {
            
            Pair p=qu.poll();
            Node node=p.root;
            int dis=p.dist;
            if(dis == k)
            {
                ans.add(node.data);
                //  
            }
            if( !st.contains(node.left) && node.left != null)
            {
                qu.add(new Pair(node.left,dis+1));
                st.add(node.left);
            }
            if(!st.contains(node.right) && node.right != null)
            {
                qu.add(new Pair(node.right,dis+1));
                st.add(node.right);
            }
            if(!st.contains(node) && mp.containsKey(node))
            {
                qu.add(new Pair(mp.get(node),dis+1));
                st.add(node);
            }
            }
        }
        Collections.sort(ans);
        return ans;
        
    }
};