class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>qu=new LinkedList<>();
        qu.add(0);
        int vis[]=new int[adj.size()];
        // ans.add(0);
        vis[0]=1;
        while(!qu.isEmpty())
        {
            int node=qu.poll();
            ans.add(node);
            for(int i:adj.get(node))
            {
                if(vis[i] == 0)
                {
                    vis[i]=1;
                    qu.add(i);
                }
            }
        }
        return ans;
        
    }
}