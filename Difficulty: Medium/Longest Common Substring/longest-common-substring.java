// User function Template for Java

class Solution {
    // public int func(String s1,String s2,int i,int j)
    // {
    //   if(i < 0 || j < 0 || s1.charAt(i) != s2.charAt(j))
    //   {
    //       return 0;
    //   }
    //   return 1+func(s1,s2,i-1,j-1);
    // }
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int ans=0;
       int dp[][]=new int[s1.length()+1][s2.length()+1];
       
        for(int i=1;i<=s1.length();i++)
        {
            // StringBuilder sb=new StringBuilder();
            for(int j=1;j<=s2.length();j++)
            {
                // sb.append(s1.charAt(j));
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                }else
                {
                    dp[i][j]=0;
                }
                // int an1=func(s1,s2,i,j);/
                // ans=Math.max(ans,an1);
            }
        }
        return ans;
    }
}