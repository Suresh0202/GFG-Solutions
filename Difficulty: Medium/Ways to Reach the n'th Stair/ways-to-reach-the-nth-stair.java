//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total testcases
        int t = sc.nextInt();

        while (t-- > 0) {

            // taking count of stairs
            int m = sc.nextInt();

            // creating an object of class DynamicProgramming
            Solution obj = new Solution();

            // calling method countWays() of class
            // DynamicProgramming
            System.out.println(obj.countWays(m));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int func(int n,int dp[])
    {
        if(n <= 1)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=func(n-1,dp)+func(n-2,dp);
        return dp[n];
        
    }
    int countWays(int n) {
        // your code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=func(n,dp);
        return ans;
    }
}
