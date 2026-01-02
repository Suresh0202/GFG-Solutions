/*class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    } */
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
      List<Integer>ar=new ArrayList<>();
      Node temp=head;
      while(temp != null)
      {
          ar.add(temp.data);
          temp=temp.next;
      }
    //   System.out.println(ar);
      for(int i=0;i<ar.size()-1;i+=2)
      {
          int temp2=ar.get(i);
          int temp1=ar.get(i+1);
        //   System.out.println(temp2 +" " +  temp1);
          ar.set(i,temp1);
          ar.set(i+1,temp2);
      }
    //   System.out.println(ar);
    //   Node x=new Node(-1);
      Node t=head;
      for(int i=0;i<ar.size();i++)
      {
          t.data=ar.get(i);
          t=t.next;
      }
      return head;
    }
}