// User function Template for Java

class Solution {
    public static int func(int idx,int val[],int wt[],int W,Integer dp[][])
    {
        if(idx == 0)
        {
          
            return (W/wt[idx])*val[idx];
        }
        if(dp[idx][W] != null){
            return dp[idx][W];
        }
        int npick=func(idx-1,val,wt,W,dp);
        int pick=Integer.MIN_VALUE;
        if(W >= wt[idx])
        {
            pick=val[idx]+func(idx,val,wt,W-wt[idx],dp);
        }
        return dp[idx][W]=Math.max(pick,npick);
    }
    static int knapSack(int val[], int wt[], int W) {
        // code here
        int n=val.length;
        Integer dp[][]=new Integer[n][W+1];
        return func(n-1,val,wt,W,dp);
    }
}