class Solution {
    public int func(int arr[],int idx,int tar,Integer dp[][])
    {
        if(idx == arr.length)
        {
            if(tar == 0)
            {
                return 1;
            }
            return 0;
        }
        if(tar == 0)
        {
            return 1;
        }
        if(dp[idx][tar] != null)
        {
            return dp[idx][tar];
        }
        int npick=func(arr,idx+1,tar,dp);
        int pick=0;
        if(tar >= arr[idx])
        {
            pick=func(arr,idx,tar-arr[idx],dp);
        }
        return dp[idx][tar]=pick+npick;
    }
    public int count(int coins[], int sum) {
        // code here.
        Integer dp[][]=new Integer[coins.length][sum+1];
        return func(coins,0,sum,dp);
    }
}