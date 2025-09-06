
class Solution {
        public int func(int arr[],int idx,int buy,int fee,Integer dp[][])
    {
        if(idx == arr.length)
        {
            return 0;
        }
        if(dp[idx][buy] != null)
        {
            return dp[idx][buy];
        }
        int max=0,tk=0,nt=0;
        if(buy == 1)
        {
            tk=-(arr[idx])+func(arr,idx+1,0,fee,dp);
            nt=func(arr,idx+1,1,fee,dp);
            max=Math.max(tk,nt);
        }else
        {
            tk=(arr[idx]-fee)+func(arr,idx+1,1,fee,dp);
            nt=func(arr,idx+1,0,fee,dp);
            max=Math.max(tk,nt);
        }
        return dp[idx][buy]=max;
    }
    public int maxProfit(int prices[], int k) {
        // Code here
        Integer dp[][]=new Integer[prices.length+1][2];
        return func(prices,0,1,k,dp);
    }
}