/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        ArrayList<Integer>ans=new ArrayList<>();
        while(head != null)
        {
            ans.add(head.data);
            head=head.next;
        }
        if(ans.size() < k)
        {
            return -1;
        }
        return ans.get(ans.size()-k);
    }
}