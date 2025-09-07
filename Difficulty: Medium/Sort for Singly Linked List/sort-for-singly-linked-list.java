// User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node findmiddle(Node head)
    {
        // Node// temp=head;
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node middle=findmiddle(head);
        Node left=head;
        Node right=middle.next;
        middle.next=null;
        left=merge(left);
        right=merge(right);
        return mergetwo(left,right);
    }
    public static Node mergetwo(Node l1,Node l2)
    {
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(l1 != null && l2 != null)
        {
            if(l1.data <= l2.data)
            {
                temp.next=new Node(l1.data);
                temp=temp.next;
                l1=l1.next;
            }else{
                temp.next=new Node(l2.data);
                temp=temp.next;
                l2=l2.next;
            }
        }
        if(l1 != null)
        {
            temp.next=l1;
        }
        if(l2 != null)
        {
            temp.next=l2;
            
        }
        return dummy.next;
    }
    public static Node insertionSort(Node head) {
        // code here
        return merge(head);
        
    }
}