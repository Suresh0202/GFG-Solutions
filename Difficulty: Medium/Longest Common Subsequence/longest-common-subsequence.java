class Solution {
    public static int func(String a,String b,int i,int j,Integer dp[][])
    {
        if(i<0 || j<0)
        {
            return 0;
        }
        if(dp[i][j] != null)
        {
            return dp[i][j];
        }
        if(a.charAt(i) == b.charAt(j))
        {
            return 1+func(a,b,i-1,j-1,dp);
        }
        int l=func(a,b,i-1,j,dp);
        int r=func(a,b,i,j-1,dp);
        return dp[i][j]= Math.max(l,r);
    }
    static int lcs(String s1, String s2) {
        // code here
        Integer dp[][]=new Integer[s1.length()+1][s2.length()+1];
        return func(s1,s2,s1.length()-1,s2.length()-1,dp);
    }
}