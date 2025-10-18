/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void func(List<Integer>ans,Node root)
    {
        if(root == null)
        {
            return;
        }
        func(ans,root.left);
        ans.add(root.data);
        func(ans,root.right);
    }
    public int findMedian(Node root) {
        // Code here
        List<Integer>ans=new ArrayList<>();
        func(ans,root);
        int ans1=0;
        int n=ans.size();
        // System.out.println(ans);
        if(ans.size() %2 == 0)
        {
            ans1=ans.get((n/2)-1);       
        }else
        {
            ans1=ans.get((n)/2);
        }
        return ans1;
    }
}