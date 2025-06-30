class Solution {
    public static int func(int idx,int W,int val[],int wt[],Integer dp[][])
    {
        if(idx == 0)
        {
            if(wt[idx] <= W)
            {
                return val[idx];
            }else
            {
                return 0;
            }
        }
        if(dp[idx][W] != null)
        {
            return dp[idx][W];
        }
        int notpick=0+func(idx-1,W,val,wt,dp);
        int pick=Integer.MIN_VALUE;
        if(W >= wt[idx])
        {
            pick=val[idx]+func(idx-1,W-wt[idx],val,wt,dp);
        }
        return dp[idx][W]=Math.max(pick,notpick);
    }
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        Integer dp[][]=new Integer[val.length][W+1];
        return func(n-1,W,val,wt,dp);
    }
}
