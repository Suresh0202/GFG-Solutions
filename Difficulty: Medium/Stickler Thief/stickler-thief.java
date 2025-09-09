class Solution {
    public int func(int arr[],int idx,Integer dp[])
    {
        if(idx < 0){
            return 0;
        }
        // if(idx == 0  || idx ==1)
        // {
        //     return arr[idx];
        // }
        
        if(dp[idx] != null)
        {
            return dp[idx];
        }
        int pick=arr[idx]+func(arr,idx-2,dp);
        int np=func(arr,idx-1,dp);
        return dp[idx]=Math.max(pick,np);
    }
    public int findMaxSum(int arr[]) {
        // code here
        
        Integer dp[]=new Integer[arr.length];
        return func(arr,arr.length-1,dp);
        
    }
}