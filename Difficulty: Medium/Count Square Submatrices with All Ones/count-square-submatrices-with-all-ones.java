// User function Template for Java

class Solution {
    public int countSquares(int N, int M, int mat[][]) {
        // Code here
        int n=mat.length;
        int m=mat[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            dp[i][0]=mat[i][0];
        }
        for(int i=0;i<m;i++)
        {
            dp[0][i]=mat[0][i];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(mat[i][j] == 1)
                {
                dp[i][j]= Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                }
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum+=dp[i][j];
            }
        }
        return sum;
        
    }
}