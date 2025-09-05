// User function Template for Java

class Solution {
    public int func(int arr[],int idx,int prev,Integer dp[][])
    {
        if(idx == arr.length)
        {
            return 0;
        }
        if(dp[idx][prev+1] != null)
        {
            return dp[idx][prev+1];
        }
        int l=0;
        if(prev == -1 || arr[prev] < arr[idx])
        {
            l=arr[idx]+func(arr,idx+1,idx,dp);
        }
       int  r=func(arr,idx+1,prev,dp);
        return dp[idx][prev+1]=Math.max(l,r);
        
    }
    public int maxSumIS(int arr[]) {
        // code here.
        Integer dp[][]=new Integer[arr.length+1][arr.length+1];
        return func(arr,0,-1,dp);
    }
}