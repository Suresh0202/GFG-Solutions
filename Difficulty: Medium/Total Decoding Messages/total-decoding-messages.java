// User function Template for Java
class Solution {
    public int countWays(String digits) {
        // code here
        int dp[]=new int[digits.length()+1];
        dp[0]=1;
        if(digits.charAt(0) == '0')
        {
            dp[1]=0;
        }else
        {
            dp[1]=1;
        }
        for(int i=2;i<dp.length;i++)
        {
            int one=Integer.valueOf(digits.substring(i-1,i));
            int two=Integer.valueOf(digits.substring(i-2,i));
            if(one >= 1 )
            {
                dp[i]+=dp[i-1];
            }
            if(two >= 10 && two <= 26)
            {
                dp[i]+=dp[i-2];
            }
        }
        return dp[digits.length()];
    }
}