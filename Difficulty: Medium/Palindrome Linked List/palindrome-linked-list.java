/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        // Your code here
        Node temp=head;
        List<Integer>arr=new ArrayList<>();
        while(temp!=null)
        {
            arr.add(temp.data);
            temp=temp.next;
        }
        int i=0;
        int j=arr.size()-1;
        // System.out.println(arr);
        while(i<=j)
        {
            if(!arr.get(i).equals(arr.get(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}