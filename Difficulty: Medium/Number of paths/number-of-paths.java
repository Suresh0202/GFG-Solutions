class Solution {
    public int func(int i,int j,int n,int m,Integer dp[][])
    {
        if(i<0 || j<0 || i>=n || j>=m){
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
        
        int left=func(i,j+1,n,m,dp);
        int right=func(i+1,j,n,m,dp);
        return dp[i][j]=left+right;
    }
    
    public int numberOfPaths(int m, int n) {
        // Code Here
         Integer dp[][]=new Integer[m][n];
        // code here
        return func(0,0,m,n,dp);
        
    }
}