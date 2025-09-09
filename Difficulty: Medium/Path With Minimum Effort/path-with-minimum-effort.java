
class Solution {
    public static boolean isVal(int sr,int sc,int r,int c)
    {
        if(sr<0 || sc<0 || sr>=r || sc>=c)
        {
            return false;
            
        }
        return true;
    }
    public static int MinimumEffort(int r, int c, int[][] grid) {
        // code here
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int vis[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            Arrays.fill(vis[i],(int)(1e9));
        }
        vis[0][0]=1;
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            int dis=arr[0];
            int sr=arr[1];
            int sc=arr[2];
            if(sr == r-1 && sc == c-1)
            {
                return dis;
            }
            if(isVal(sr+1,sc,r,c))
            {
                //1
                int dist=Math.max(dis,Math.abs(grid[sr+1][sc]-grid[sr][sc]));
                if(dist < vis[sr+1][sc])
                {
                    vis[sr+1][sc]=(dist);
                    pq.add(new int[]{dist,sr+1,sc});
                }
                
            }
            if(isVal(sr-1,sc,r,c))
            {
                //2
                int dist=Math.max(dis,Math.abs(grid[sr-1][sc]-grid[sr][sc]));
                if(dist < vis[sr-1][sc])
                {
                    vis[sr-1][sc]=dist;
                    pq.add(new int[]{dist,sr-1,sc});
                }
            }
            if(isVal(sr,sc+1,r,c))
            {
                //3
                int dist=Math.max(dis,Math.abs(grid[sr][sc+1]-grid[sr][sc]));
                if(dist < vis[sr][sc+1])
                {
                    vis[sr][sc+1]=dist;
                    pq.add(new int[]{dist,sr,sc+1});
                }
            }
            if(isVal(sr,sc-1,r,c))
            {
                //4
                int dist=Math.max(dis,Math.abs(grid[sr][sc-1]-grid[sr][sc]));
                if(dist < vis[sr][sc-1])
                {
                    vis[sr][sc-1]=dist;
                    pq.add(new int[]{dist,sr,sc-1});
                }
            }
        }
        return 0;
        
    }
}
