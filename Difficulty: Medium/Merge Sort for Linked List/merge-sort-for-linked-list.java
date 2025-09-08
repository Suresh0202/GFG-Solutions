/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node findMiddle(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node middle=findMiddle(head);
        Node rig=middle.next;
        middle.next=null;
        Node left=merge(head);
        Node right=merge(rig);
        return mergelist(left,right);
    }
    public Node mergelist(Node l1,Node l2)
    {
        Node temp=new Node(-1);
        Node dummy=temp;
        while(l1 != null && l2 != null)
        {
            if(l1.data <= l2.data)
            {
                dummy.next=l1;
                l1=l1.next;
                dummy=dummy.next;
            }else
            {
                dummy.next=l2;
                l2=l2.next;
                dummy=dummy.next;
            }
        }
       if(l1 != null)
       {
           dummy.next=l1;
       }
       if(l2 != null)
       {
           dummy.next=l2;
       }
        return temp.next;
    }
    public Node mergeSort(Node head) {
        // code here
        return merge(head);
    }
}