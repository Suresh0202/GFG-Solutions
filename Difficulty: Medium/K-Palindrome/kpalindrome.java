class Solution {
   
    public int kPalindrome(String a, int n, int k) {
        // code here
        int dp[][]=new int[n+1][n+1];
        StringBuilder sb=new StringBuilder(a);
        String b=sb.reverse().toString();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(a.charAt(i-1) == b.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int ans=n-dp[n][n];
        return (ans<=k)?1:0;
        
    }
}