
class Solution {
    public boolean func(int sr,int sc,int dr,int dc,int n,int grid[][],boolean vis[][])
    {
        if(sr<0 || sc<0 || sr>=n || sc>=n || grid[sr][sc] == 0 || vis[sr][sc] == true)
        {
            return false;
        }
        if(sr == dr && sc == dc)
        {
            return true;
        }
       
            vis[sr][sc]=true;
            if (func(sr+1, sc, dr, dc, n, grid, vis)) return true;
if (func(sr-1, sc, dr, dc, n, grid, vis)) return true;
if (func(sr, sc+1, dr, dc, n, grid, vis)) return true;
if (func(sr, sc-1, dr, dc, n, grid, vis)) return true;
            
            
            
            
        return false;
    }
    // Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid) {
        // Code here
        
        int sr=-1;
        int sc=-1;
        int dr=-1;
        int dc=-1;
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                {
                    sr=i;
                    sc=j;
                    
                }
                if(grid[i][j] == 2)
                {
                    dr=i;
                    dc=j;
                }
            }
        }
        boolean vis[][]=new boolean[n][n];
        return func(sr,sc,dr,dc,n,grid,vis);
    }
}