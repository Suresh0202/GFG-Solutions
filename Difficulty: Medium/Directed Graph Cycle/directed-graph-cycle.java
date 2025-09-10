class Solution {
    public boolean isCyclic(int V, int[][] edges) {
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
        int indg[]=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int it:adj.get(i))
            {
                indg[it]++;
            }
        }
        Queue<Integer>qu=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indg[i] == 0)
            {
                qu.add(i);
            }
        }
        List<Integer>ans=new ArrayList<>();
        while(!qu.isEmpty())
        {
            int node=qu.poll();
            ans.add(node);
            for(int it:adj.get(node))
            {
                indg[it]--;
                
                if(indg[it] == 0)
                {
                    qu.add(it);
                }
            }
        }
        if(ans.size() < V)
        {
            return true;
        }
        return false;
       
        
    }
}