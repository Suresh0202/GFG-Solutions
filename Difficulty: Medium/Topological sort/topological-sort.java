class Solution {
    public static void dfs(int node,ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>ans,int vis[]){
        vis[node]=1;
        for(int it:adj.get(node))
        {
            if(vis[it] == -1)
            {
                vis[it]=1;
                dfs(it,adj,ans,vis);
            }
        }
        ans.add(0,node);
    }
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
       for(int e[]:edges)
       {
           int u=e[0];
           int v=e[1];
           adj.get(u).add(v);
           
       }
       ArrayList<Integer>ans=new ArrayList<>();
        int vis[]=new int[V];
        Arrays.fill(vis,-1);
        for(int i=0;i<V;i++)
        {
            if(vis[i] == -1)
            {
                dfs(i,adj,ans,vis);
                vis[i]=1;
            }
        }
        return ans;
        
    }
}