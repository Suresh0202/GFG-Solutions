/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Pair{
    int val;
    Node node;
    Pair(Node node,int val)
    {
        this.val=val;
        this.node=node;
    }
}
class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
       
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Pair>qu=new LinkedList<>();
        qu.add(new Pair(root,0));
        TreeMap<Integer,ArrayList<Integer>>mp=new TreeMap<>();
        while(!qu.isEmpty())
        {
            Pair p=qu.poll();
            int vert=p.val;
            if(!mp.containsKey(vert))
            {
                mp.put(vert,new ArrayList<>());
            }
            mp.get(vert).add(p.node.data);
            if(p.node.left != null)
            {
                qu.add(new Pair(p.node.left,vert-1));
            }
            if(p.node.right != null)
            {
                qu.add(new Pair(p.node.right,vert+1));
            }
        }
        for(int key:mp.keySet())
        {
            ans.add(mp.get(key).get(0));
        }
        return ans;
    }
}