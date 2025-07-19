class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>qu=new LinkedList<>();
        qu.add(0);
        int vis[]=new int[adj.size()];
        vis[0]=1;
        while(!qu.isEmpty())
        {
            int x=qu.poll();
            ans.add(x);
            vis[x]=1;
            for(int i:adj.get(x))
            {
                if(vis[i] != 1)
                {
                    vis[i]=1;
                    qu.add(i);
                }
            }

        }
        return ans;
        
    }
}