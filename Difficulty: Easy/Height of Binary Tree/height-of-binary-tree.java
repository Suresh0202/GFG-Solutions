/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    public int func(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        int left=func(node.left);
        int right=func(node.right);
        return 1+Math.max(left,right);
    }
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node == null)
        {
            return 0;
        }
        return func(node)-1;
        
    }
}