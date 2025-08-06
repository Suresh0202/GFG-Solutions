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
class Solution {
    int getLevelDiff(Node root) {
        // code here
        Queue<Node>qu=new LinkedList<>();
        qu.add(root);
        int level=0;
        int e=0;
        int od=0;
        while(!qu.isEmpty())
        {
            int len=qu.size();
            for(int i=0;i<len;i++)
            {
                if(qu.peek().left != null)
                {
                    qu.add(qu.peek().left);
                }
                if(qu.peek().right  != null)
                {
                    qu.add(qu.peek().right);
                }
                if(level % 2 == 0)
                {
                    e+=qu.poll().data;
                }else
                {
                    od+=qu.poll().data;
                }
            }
            level++;
        }
        return e-od;
    }
}