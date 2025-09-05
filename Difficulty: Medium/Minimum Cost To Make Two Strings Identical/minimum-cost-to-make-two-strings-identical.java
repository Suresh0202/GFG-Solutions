class Solution {
    public int func(String a,String b,int i,int j,int xc,int yc,Integer dp[][])
    {
        if(i<0)
        {
            return (j+1)*yc;
        }
        if(j<0)
        {
            return (i+1)*xc;
        }
        if(dp[i][j] != null)
        {
            return dp[i][j];
        }
        if(a.charAt(i) == b.charAt(j))
        {
            return func(a,b,i-1,j-1,xc,yc,dp);
        }
        int A=xc+func(a,b,i-1,j,xc,yc,dp);
        int B = yc+func(a,b,i,j-1,xc,yc,dp);
        return dp[i][j]=Math.min(A,B);
    }
    public int findMinCost(String x, String y, int costX, int costY) {
        Integer dp[][]=new Integer[x.length()+1][y.length()+1];
        return func(x,y,x.length()-1,y.length()-1,costX,costY,dp);
    }
}
