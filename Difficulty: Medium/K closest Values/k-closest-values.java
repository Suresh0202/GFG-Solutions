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
    public void func(Node root,TreeMap<Integer,List<Integer>>mp,int tar)
    {
        if(root == null)
        {
            return;
        }
        func(root.left,mp,tar);
        int diff=Math.abs(tar-root.data);
        if(!mp.containsKey(diff))
        {
            mp.put(diff,new ArrayList<>());
        }
        mp.get(diff).add(root.data);
        func(root.right,mp,tar);
    }
    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        TreeMap<Integer,List<Integer>>mp=new TreeMap<>();
        func(root,mp,target);
        ArrayList<Integer>ans=new ArrayList<>();
        for(int val:mp.keySet())
        {
            List<Integer>ar=mp.get(val);
            for(int i=0;i<ar.size();i++)
            {
                if(ans.size()  < k)
                {
                ans.add(ar.get(i));
                    // break;
                }
            }
            if(ans.size() > k)
            {
                break;
            }
        }
        return ans;
        
    }
}