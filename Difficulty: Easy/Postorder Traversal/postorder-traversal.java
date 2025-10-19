/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public void func(ArrayList<Integer>arr,Node root)
    {
        if(root == null)return;
        func(arr,root.left);
        func(arr,root.right);
        arr.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer>arr=new ArrayList<>();
        func(arr,root);
        return arr;
        
    }
}