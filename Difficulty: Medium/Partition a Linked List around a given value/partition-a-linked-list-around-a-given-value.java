// User function Template for Java

/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node partition(Node node, int x) {
        // Your code here
        Node head=new Node(-1);
        Node dummy=head;
        Node temp=node;
        while(temp != null)
        {
            if(temp.data < x)
            {
                dummy.next=new Node(temp.data);
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        temp=node;
         while(temp != null)
        {
            if(temp.data == x)
            {
                dummy.next=new Node(temp.data);
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        temp=node;
         while(temp != null)
        {
            if(temp.data > x)
            {
                dummy.next=new Node(temp.data);
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        return head.next;
        
        
        
    }
}