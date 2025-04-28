//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.nthTribonacci(n);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int func(int n,int dp[])
    {
        if(n==0)return 0;
        if(n ==1 || n == 2) return 1;
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=func(n-1,dp)+func(n-2,dp)+func(n-3,dp);
        return dp[n];
    }
    public static int nthTribonacci(int n) {
        // code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=func(n,dp);
        
        return ans;
    }
}
