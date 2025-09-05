class Solution {
    public int func(int grid[][],int i,int j,int n,int m,Integer dp[][])
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j] ==1)
        {
            return 0;
        }
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
        if(dp[i][j] != null)
        {
            return dp[i][j];
        }
        
        int left=func(grid,i,j+1,n,m,dp);
        int right=func(grid,i+1,j,n,m,dp);
        return dp[i][j]=left+right;
    }
    public int uniquePaths(int[][] grid) {
        Integer dp[][]=new Integer[grid.length+1][grid[0].length+1];
        // code here
        return func(grid,0,0,grid.length,grid[0].length,dp);
    }
};