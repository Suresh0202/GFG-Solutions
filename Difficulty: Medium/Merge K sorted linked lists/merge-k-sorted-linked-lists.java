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
    Node mergeKLists(Node[] arr) {
        // code here
        PriorityQueue<Node>pq=new PriorityQueue<>((a,b)->a.data-b.data);
        for(Node i:arr)
        {
            pq.add(i);
        }
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(!pq.isEmpty())
        {
            Node min=pq.poll();
            temp.next=min;
            temp=temp.next;
            min=min.next;
            if(min != null)
            {
                pq.add(min);
                // min=min.next;
            }
        }
        return dummy.next;
    }
}