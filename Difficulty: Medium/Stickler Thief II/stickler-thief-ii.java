class Solution {
    public int func(int arr[],int idx,int n,Integer dp[])
    {
        if(idx > n)
        {
            return 0;
        }
        if(dp[idx] != null)
        {
            return dp[idx];
        }
        int pick=arr[idx]+func(arr,idx+2,n,dp);
        int np=func(arr,idx+1,n,dp);
        return dp[idx]=Math.max(pick,np);
    }
    int maxValue(int[] arr) {
        // code here
        if(arr.length == 1)
        {
            return arr[0];
        }
        Integer dp[]=new Integer[arr.length];
        Integer dp1[]=new Integer[arr.length];
        int ans1=func(arr,1,arr.length-1,dp);
        int ans2=func(arr,0,arr.length-2,dp1);
        return Math.max(ans1,ans2);
        
    }
}
