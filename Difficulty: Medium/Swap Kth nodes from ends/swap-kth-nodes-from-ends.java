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
    public int findsize(Node x)
    {
        Node y=x;
        int cnt=0;
        while(y != null)
        {
            y=y.next;
            cnt++;
        }
        return cnt;
    }
    public Node swapKth(Node head, int k) {
        // code here
        Node temp=head;
        int front=k;
        int frontval=0;
        Node frontNode=null;
        while(temp != null && front-->0)
        {
            frontval = temp.data;
            frontNode=temp;
            temp=temp.next;
        }
        Node x=head;
        int len=findsize(x);
        int last=len-k+1;
        int lastval=0;
        Node lastNode=null;
        Node x1=head;
        while(x1!= null && last-->0)
        {
            lastNode=x1;
            lastval=x1.data;
            x1=x1.next;
        }
        if(frontval != 0 && lastval != 0)
        {
            Node z=head;
            while(z != null)
            {
                if(z == frontNode)
                {
                    z.data=lastval;
                    
                }
                else if(z == lastNode)
                {
                    z.data = frontval;
                }
                z=z.next;
            }
        }
        return head;
    }
}
