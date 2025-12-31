/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        HashSet<Node>st=new HashSet<>();
        Node l1=head1;
        while(l1 != null)
        {
            st.add(l1);
            l1=l1.next;
        }
        Node l2=head2;
        while(l2 != null)
        {
            if(st.contains(l2))
            {
                return l2;
            }
            st.add(l2);
            l2=l2.next;
        }
        return null;
    }
}