// User function Template for Java
class Solution {
    public int func(int arr[],int idx,int buy,Integer dp[][])
    {
        if(idx == arr.length)
        {
            return 0;
        }
        int take=0;
        int nott=0;
        int max=0;
        if(dp[idx][buy] != null)
        {
            return dp[idx][buy];
        }
        if(buy == 1)
        {
            take=-(arr[idx])+func(arr,idx+1,0,dp);
            nott=0+func(arr,idx+1,1,dp);
            max=Math.max(take,nott);
        }else
        {
            take=(arr[idx])+func(arr,idx+1,1,dp);
            nott=func(arr,idx+1,0,dp);
            max=Math.max(take,nott);
        }
        return dp[idx][buy]=max;
    }
    public int maximumProfit(int prices[]) {
        // code here
        Integer dp[][]=new Integer[prices.length+1][2];
        return func(prices,0,1,dp);
    }
}