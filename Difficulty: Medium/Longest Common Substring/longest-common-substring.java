// User function Template for Java

class Solution {
    public int func(String s1,String s2,int i,int j,Integer dp[][])
    {
        if(i<0 || j<0)return 0;
        int x=i;
        int cn=0;
        int y=j;
        if(dp[i][j] != null)
        {
            return dp[i][j];
        }
        while(x>=0 && y>=0 && s1.charAt(x) == s2.charAt(y))
        {
            x--;
            y--;
            cn++;
        }
        int a=func(s1,s2,i-1,j,dp);
        int b=func(s1,s2,i,j-1,dp);
        return dp[i][j]=Math.max(cn,Math.max(a,b));
    }
    public int longestCommonSubstr(String s1, String s2) {
        Integer dp[][]=new Integer[s1.length()][s2.length()];
        // code here
        return func(s1,s2,s1.length()-1,s2.length()-1,dp);
    }
}