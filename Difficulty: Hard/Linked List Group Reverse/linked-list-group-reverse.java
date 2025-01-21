//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class ReverseInSize {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < s.length; i++) {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverseKGroup(head, k);
            printList(res, out);
            out.println();

            out.println("~");
        }
        out.close();
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
    }
}

// } Driver Code Ends


/*node class of the linked list
class Node
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
    public static Node reverseKGroup(Node head, int k) {
         if(head.next==null) return head;
        Node prevNode=null, nextNode=null;
        Node curr=head;
        while(curr!=null){
            Node kthNode=getKthNode(curr, k);
            nextNode=kthNode.next;
            kthNode.next=null;
            reverse(curr);
            if(curr==head){
                head=kthNode;
            }
            else{
                prevNode.next=kthNode;
            }
            prevNode=curr;
            curr=nextNode;
        }
        return head;
    }
    static Node getKthNode(Node head, int k){
        for(int i=1;i<k;i++){
            if(head.next==null) return head;
            head=head.next;
        }
        return head;
    }
    static Node reverse(Node head){
        if(head.next==null) return head;
        Node first=null, second=head;
        while(second!=null){
            Node nextNode=second.next;
            second.next=first;
            first=second;
            second=nextNode;
        }
        return first;

    }
}
