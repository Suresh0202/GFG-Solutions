/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
     ArrayList<Integer>ans=new ArrayList<>();
     Queue<Node>qu=new LinkedList<>();
     qu.add(root);
     int cnt=0;
     while(!qu.isEmpty())
     {
         int len=qu.size();
         ArrayList<Integer>ans1=new ArrayList<>();
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
             if(cnt % 2 == 0)
             {
                 ans1.add(qu.poll().data);
             }else
             {
                 ans1.add(0,qu.poll().data);
             }
            //  qu.poll().;
         }
            ans.addAll(ans1);
         cnt++;
     }
     return ans;
    }
}