/*Complete The given function
The Node class is as follows:
class Node{
    int data;
    Node left,right;

    Node(int d)
     {
      data=d;
      left=null;
      right=null;
    }
}*/
class Solution {
    public ArrayList<Integer> extremeNodes(Node root) {
        // add code here.
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Node>qu=new LinkedList<>();
        qu.add(root);
        int level=0;
        while(!qu.isEmpty())
        {
            int len=qu.size();
            ArrayList<Integer>a=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                if(qu.peek().left != null)
                {
                    qu.add(qu.peek().left);
                }
                if(qu.peek().right != null)
                {
                    qu.add(qu.peek().right);
                }
                a.add(qu.poll().data);
            }
            if(level %2 == 0)
            {
                ans.add(a.get(a.size()-1));
            }else
            {
                ans.add(a.get(0));
            }
            level++;
        }
        return ans;
    }
}