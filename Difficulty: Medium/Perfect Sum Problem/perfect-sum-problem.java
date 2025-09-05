

class Solution {
    int c=0;
 int func(int nums[],int t,int idx,int n,Integer dp[][])
    {
        if(idx==n)
        {
            if(t == 0 )
            {
                return 1;
            
            }
            return 0;
        }
        if(dp[idx][t] != null)
        {
            return dp[idx][t];
        }
        int pick=0;
        int np=0;
        if(nums[idx] <= t)
        {
        pick=func(nums,t-nums[idx],idx+1,n,dp);
            
        }
        np=func(nums,t,idx+1,n,dp);
        return dp[idx][t]=(pick+np);
    }
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        Integer dp[][]=new Integer[nums.length+1][target+1];
       int ns= func(nums,target,0,nums.length,dp);
        return ns;
    }
}