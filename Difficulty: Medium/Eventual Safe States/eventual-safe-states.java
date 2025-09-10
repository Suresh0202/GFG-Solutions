// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        // Your code here
        // int V=adj.size();//
        List<List<Integer>>adjrev=new ArrayList<>();
                for(int i=0; i<V; i++) {
                 adjrev.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {
            for(int x:adj.get(i))
            {
                adjrev.get(x).add(i);
            }
        }
        int indeg[]=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int j:adjrev.get(i))
            {
                indeg[j]++;
            }
        }
        Queue<Integer>qu=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indeg[i] == 0)
            {
                qu.add(i);
            }
        }
        List<Integer>ans=new ArrayList<>();
        while(!qu.isEmpty())
        {
            int nod=qu.poll();
            ans.add(nod);
            for(int it:adjrev.get(nod))
            {
                indeg[it]--;
                if(indeg[it] == 0)
                {
                    qu.add(it);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
