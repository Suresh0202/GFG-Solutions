// User function Template for Java

class Solution {
    public static void dfs(int vis[],int i,ArrayList<ArrayList<Integer>>a)
    {
        vis[i]=1;
        for(int it:a.get(i))
        {
            if(vis[it] == 0)
            {
                dfs(vis,it,a);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        ArrayList<ArrayList<Integer>>a=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            a.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                if(adj.get(i).get(j) == 1 && i != j)
                {
                    
               a.get(i).add(j);
               a.get(j).add(i);
                }
            }
        }
        int vis[]=new int[V];
        int cnt=0;
        for(int i=0;i<V;i++)
        {
            if(vis[i] == 0)
            {
                cnt++;
                dfs(vis,i,a);
            }
        }
        return cnt;
        
    }
}