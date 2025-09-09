class Solution {

    public int CheapestFLight(int n, int flights[][], int src, int dst, int k) {
        // Code here
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int f[]:flights)
        {
            int from=f[0];
            int to=f[1];
            int cost=f[2];
            adj.get(from).add(new int[]{to,cost});
        }
        int distance[]=new int[n];
        Arrays.fill(distance,(int)(1e9));
        Queue<int[]>qu=new LinkedList<>();
        qu.add(new int[]{0,src,0});
        // distance[0]=0;
        while(!qu.isEmpty())
        {
            int tri[]=qu.poll();
            int stop=tri[0];
            int node=tri[1];
            int dist=tri[2];
            if(stop > k)continue;
            for(int it[]:adj.get(node))
            {
                int nodeP=it[0];
                int curr=it[1];
                if(dist + curr < distance[nodeP])
                {
                    distance[nodeP]=dist+curr;
                    qu.add(new int[]{stop+1,nodeP,(curr+dist)});
                }
            }
        }
        if(distance[dst] != (int)(1e9))
        {
            return distance[dst];
        }
        return -1;
    }
}