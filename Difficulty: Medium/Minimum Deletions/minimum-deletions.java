class Solution {
    static int func(String s,int i,int j,Integer dp[][])
    {
        if(i>=j)
        {
            return 0;
        }
        if(dp[i][j] != null)
        {
            return dp[i][j];
        }
        if(s.charAt(i) == s.charAt(j))
        {
            return func(s,i+1,j-1,dp);
        }
        return dp[i][j]=1+Math.min(func(s,i+1,j,dp),func(s,i,j-1,dp));
    }
    static int minDeletions(String s) {
        // code here
        Integer dp[][]=new Integer[s.length()+1][s.length()+1];
     return func(s,0,s.length()-1,dp);   
    }
}