/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        ArrayList<Node>st=new ArrayList<>();
        LinkedHashMap<Node,Integer>mp=new LinkedHashMap<>();
        Node temp=head;
        int ans=-1;
        Node x=null;
        while(temp != null)
        {
            if(mp.containsKey(temp))
            {
                x=temp;
                st.add(temp);
                break;
            }
            // System.out.println("inside "+temp);
            st.add(temp);
            mp.put(temp,0);
            temp=temp.next;
        }
        // Node y=temp;
        // while(y!= null)
        // {
        //     while(y == x)
        //     {
                
        //     }
        // }
        for(int i=0;i<st.size();i++)
        {
            if(x == st.get(i))
            {
                ans=i;
                break;
            }
        }
        int ans1=-1;
        for(int i=0;i<st.size();i++)
        {
            if(x == st.get(i) && i != ans)
            {
                ans1=i;
                break;
            }
        }
        // System.out.println(ans +" " + ans1);
        return ans1-ans;
    }
}