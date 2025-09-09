// User function Template for Java

class Solution {
    public boolean isVal(int sr,int sc,int vis[][],int grid[][])
    {
        if(sr<0|| sc<0 || sc>=grid[0].length || sr>=grid.length || vis[sr][sc]==1 || grid[sr][sc]==0)
        {
            return false;
        }
        return true;
    }
    int shortestDistance(int N, int M, int grid[][], int X, int Y) {
        // code here
        Queue<int[]>qu=new LinkedList<>();
        if(grid[0][0] == 0)
        {
            return -1;
        }
        int vis[][]=new int[N][M];
        qu.add(new int[]{0,0,0});
        while(!qu.isEmpty())
        {
            int trip[]=qu.poll();
            int sr=trip[0];
            int sc=trip[1];
            int dis=trip[2];
            if(sr == X && sc == Y)
            {
                return dis;
            }
            if(isVal(sr+1,sc,vis,grid))
            {
                vis[sr+1][sc]=1;
                qu.add(new int[]{sr+1,sc,dis+1});
            }
            if(isVal(sr,sc+1,vis,grid))
            {
                qu.add(new int[]{sr,sc+1,dis+1});
                vis[sr][sc+1]=1;
            }
            if(isVal(sr-1,sc,vis,grid)){
                qu.add(new int[]{sr-1,sc,dis+1});
                vis[sr-1][sc]=1;
            }
            if(isVal(sr,sc-1,vis,grid))
            {
                qu.add(new int[]{sr,sc-1,dis+1});
                vis[sr][sc-1]=1;
            }
        }
        return -1;
    }
};