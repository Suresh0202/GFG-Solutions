class Solution {
    static boolean func(int arr[],int tar,int idx,Boolean dp[][])
    {
        if(idx == arr.length)
        {
            if(tar == 0)
            {
                return true;
            }
            return false;
        }
        if(dp[idx][tar] != null)
        {
            return dp[idx][tar];
        }
        boolean p=false;
        if(arr[idx] <= tar)
        {
            p=func(arr,tar-arr[idx],idx+1,dp);
        }
        boolean np=func(arr,tar,idx+1,dp);
        return dp[idx][tar]=(p||np);
    }
    static boolean equalPartition(int arr[]) {
        // code here
        
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        if(sum % 2 != 0)
        {
            return false;
        }
        int x=sum/2;
        Boolean [][]dp=new Boolean[arr.length+1][x+1];
        return func(arr,sum/2,0,dp);
    }
}