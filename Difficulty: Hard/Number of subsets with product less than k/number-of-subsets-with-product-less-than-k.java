// User function Template for Java


class Solution {
     public int func(int nums[],int idx,int pro,int k)
    {
        if(idx == nums.length)
        {
            if(pro <= k)
            {
                return 1;
            }
            return 0;
        }
        int np=func(nums,idx+1,pro,k);
        int pick=0;
        if(pro * nums[idx] <=k)
        {
            pick=func(nums,idx+1,pro*nums[idx],k);
        }
        return pick+np;
    }
    public int numOfSubsets(int[] arr, int k) {
        // code here
          return func(arr,0,1,k)-1;
        
    }
};