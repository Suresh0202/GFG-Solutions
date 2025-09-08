class Solution {
    static int minDeletions(String s) {
        // code here
        Integer dp[][]=new Integer[s.length()][s.length()];
        return func(s,dp,0,s.length()-1);
    }
    static int func(String s,Integer dp[][],int i,int j)
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
            return func(s,dp,i+1,j-1);
        }
        return dp[i][j]=1+Math.min(func(s,dp,i+1,j) , func(s,dp,i,j-1));
    }
}