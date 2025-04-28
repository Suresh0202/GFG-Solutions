//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.lucas(n));
                
System.out.println("~");
}
        }
}    
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int mod=(int)(1e9+7);
    public long func(int n,long dp[])
    {
        if(n == 0)return 2;
        if(n == 1)return 1;
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=func(n-1,dp)+func(n-2,dp)%mod;
        dp[n]=dp[n]%mod;
        return dp[n];
    }
    public long lucas(int n) {
        // code here.
    long dp[]=new long[n+1];
    Arrays.fill(dp,-1);
        long ans=func(n,dp);
        
        return ans;
    }
};
