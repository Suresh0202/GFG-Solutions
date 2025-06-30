class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        Integer dp[][]=new Integer[val.length][W+1];
        int n=val.length;
        for(int i=0;i<=W;i++)
        {   
            if(i >= wt[0])
            {
                dp[0][i]=val[0];
            }else
            {
                dp[0][i]=0;
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<=W;j++)
            {
                int npick=dp[i-1][j];
                int pick=0;
                if(j >= wt[i])
                {
                    pick=val[i]+dp[i-1][j-wt[i]];
                }
                dp[i][j]=Math.max(pick,npick);
            }
        }
        return dp[n-1][W];
    }
}
