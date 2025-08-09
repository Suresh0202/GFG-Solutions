class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        List<Integer>ans=new ArrayList<>();
        Node temp=root;
        while(temp != null)
        {
            Node x=temp;
            // ans.add(temp.data);
            while(x != null)
            {
                ans.add(x.data);
                x=x.bottom;
            }
            temp=temp.next;
        }
        Collections.sort(ans);
        // System.out.println(ans);
        Node head=new Node(-1);
        Node dummy=head;
        for(int i=0;i<ans.size();i++)
        {
            dummy.bottom=new Node(ans.get(i));
            dummy=dummy.bottom;
        }
        return head.bottom;
        
    }
}