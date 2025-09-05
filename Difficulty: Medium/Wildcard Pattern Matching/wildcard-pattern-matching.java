class Solution {
    public boolean func(String a,String b,int i,int j,Boolean dp[][])
    {
        if(i<0 && j < 0)
        {
            return true;
        }
        if(i<0 && j>=0)
        {
            return false;
        }
        if(j<0 && i>=0)
        {
            // if there are only ** left in a string ,return true becos * can also be empty string
            
            for(int ii=0;ii<=i;ii++)
            {
                if(a.charAt(ii) != '*')
                {
                    return false;
                }
            }
            return true;
        }
        if(dp[i][j] != null)
        {
            return dp[i][j];
        }
        if((a.charAt(i) == b.charAt(j)) || (a.charAt(i) == '?'))
        {
            return func(a,b,i-1,j-1,dp);
        }
        if(a.charAt(i) == '*')
        {
            return dp[i][j]=func(a,b,i-1,j,dp) || func(a,b,i,j-1,dp);
        }
        return false;
        
    }
    public boolean wildCard(String txt, String pat) {
        // Your code goes here
        Boolean dp[][]=new Boolean[pat.length()+1][txt.length()+1];
        return func(pat,txt,pat.length()-1,txt.length()-1,dp);
    }
}