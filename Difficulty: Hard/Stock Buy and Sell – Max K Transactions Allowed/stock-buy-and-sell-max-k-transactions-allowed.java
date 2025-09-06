class Solution {
     public static int func(int arr[],int idx,int buy,int cap,Integer dp[][][])
    {
        if(cap == 0)
        {
            return 0;
        }
        if(idx == arr.length)
        {
            return 0;
        }
        int p=0;
        int np=0;
        int max=0;
        if(dp[idx][buy][cap] != null)
        {
            return dp[idx][buy][cap];
        }
        if(buy == 1)
        {
            p=-(arr[idx])+func(arr,idx+1,0,cap,dp);
            np=func(arr,idx+1,1,cap,dp);
            max=Math.max(p,np);
        }else
        {
            p=arr[idx]+func(arr,idx+1,1,cap-1,dp);
            np=func(arr,idx+1,0,cap,dp);
            max=Math.max(p,np);
        }
        return dp[idx][buy][cap]=max;
    }
    static int maxProfit(int prices[], int k) {
        // code here
         int n=prices.length;
        Integer dp[][][]=new Integer[n+1][2][k+1];

        return func(prices,0,1,k,dp);
        
    }
}