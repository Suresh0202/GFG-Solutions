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
    public int func(Node temp)
    {
        int c=1;
        Node x=temp.next;
        while(x != temp)
        {
            x=x.next;
            c++;
        }
        return c;
    }
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        int c=0;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast)
            {
               return func(slow);
            }
        }
        return 0;
    }
}