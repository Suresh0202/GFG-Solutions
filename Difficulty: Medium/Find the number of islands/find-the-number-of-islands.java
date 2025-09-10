class Solution {
    public void dfs(int sr,int sc,int n,int m,int vis[][],char grid[][])
    {
        if(sr<0 || sc<0 || sr>=n || sc>=m || vis[sr][sc] != -1 || grid[sr][sc] !='L')
        {
            return;
        }
        vis[sr][sc]=1;
        dfs(sr+1,sc+1,n,m,vis,grid);
        dfs(sr-1,sc-1,n,m,vis,grid);
        dfs(sr+1,sc-1,n,m,vis,grid);
        dfs(sr-1,sc+1,n,m,vis,grid);
        dfs(sr+1,sc,n,m,vis,grid);
        dfs(sr,sc+1,n,m,vis,grid);
        dfs(sr,sc-1,n,m,vis,grid);
        dfs(sr-1,sc,n,m,vis,grid);
        
    }
    public int countIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(vis[i],-1);
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j] == -1 && grid[i][j] == 'L')
                {
                    dfs(i,j,n,m,vis,grid);
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}