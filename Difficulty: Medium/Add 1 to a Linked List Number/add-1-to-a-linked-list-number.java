/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head)
    {
        Node prev=null;
        Node temp=head;
        while(temp != null)
        {
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
            
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        Node zz=reverse(head);
        Node temp=zz;
        int carry=1;
        while(temp != null)
        {
            int x=temp.data+carry;
            // System.out.println(x);
            temp.data=(x%10);
            carry=x/10;
            if(carry == 0)
            {
                break;
            }
             if(temp.next == null && carry > 0)
        {
            Node y=new Node(carry);
            temp.next=y;
            temp=temp.next;
        }
            temp=temp.next;
        }
        // System.out.println/(carry);
        // if(carry > 0)
        // {
        //     Node y=new Node(carry);
        //     temp.next=y;
        //     temp=temp.next;
        // }
        Node ans=reverse(zz);
        return ans;
    }
}