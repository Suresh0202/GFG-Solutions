class Solution {
    public int dfs(int sr,int ds,ArrayList<ArrayList<Integer>>adj,int vis[])
    {
        if(sr == ds)
        {
            return 1;
        }
        int cnt=0;
        if(vis[sr] != -1)
        {
            return vis[sr];
        }
        for(int it:adj.get(sr))
        {
            // if(!vis[it])
            {
           cnt+=dfs(it,ds,adj,vis);
            // vis[it]=true;
            }
        }
        return vis[sr]=cnt;
    }
    public int countPaths(int[][] edges, int V, int src, int dest) {
        // Code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
       for(int e[]:edges){
           int u=e[0];
           int v=e[1];
           adj.get(u).add(v);
       }
       int vis[]=new int[V+1];
        Arrays.fill(vis,-1);
       return dfs(src,dest,adj,vis);
    }
}