/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
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
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
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
            ArrayList<Integer>a=mp.get(key);
            ans.add(a.get(a.size()-1));
        }
        return ans;
    }
}