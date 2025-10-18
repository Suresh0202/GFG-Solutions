class Solution {
    static int func(int arr[],int prev,int idx,Integer dp[][])
    {
        if(idx >= arr.length){
            return 0;
        }
        if(prev != -1 && dp[idx][prev+1] != null)
        {
            return dp[idx][prev+1];
        }
        int p=0;
        if(prev == -1 || arr[idx] > arr[prev])
        {
            p=1+func(arr,idx,idx+1,dp);
        }
       int  np=func(arr,prev,idx+1,dp);
        return dp[idx][prev+1]=Math.max(p,np);
    }
    static int lis(int arr[]) {
        // code here
        Integer dp[][]=new Integer[arr.length][arr.length+1];
        int ans=func(arr,-1,0,dp);
        return ans;
    }
}