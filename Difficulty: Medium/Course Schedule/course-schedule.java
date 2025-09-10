class Solution {
    public static ArrayList<Integer> findOrder(int n, int[][] pri) {
        // code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int m=pri.length;
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
       for(int e[]:pri)
       {
           int u=e[0];
           int v=e[1];
        //   adj.get(u).add(v);
          adj.get(v).add(u);
       }
       int indeg[]=new int[n];
       for(int i=0;i<n;i++)
       {
           for(int it:adj.get(i))
           {
               indeg[it]++;
           }
       }
       Queue<Integer>qu=new LinkedList<>();
       for(int i=0;i<n;i++)
       {
           if(indeg[i] == 0)
           {
               qu.add(i);
           }
       }
       ArrayList<Integer>ans=new ArrayList<>();
       while(!qu.isEmpty())
       {
           int node=qu.poll();
           ans.add(node);
           for(int  it:adj.get(node))
           {
               indeg[it]--;
               if(indeg[it] == 0)
               {
                   qu.add(it);
               }
           }
       }
     if(ans.size() == n)
     {
     return ans;
     }
         return new ArrayList<>();
    }
}