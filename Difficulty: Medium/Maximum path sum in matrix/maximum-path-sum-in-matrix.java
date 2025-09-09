// User function Template for Java
class Solution {
    public int func(int mat[][],int sr,int sc,Integer vis[][])
    {
        if(sr<0 || sc<0 || sr>=mat.length || sc>=mat[0].length )
        {
            return Integer.MIN_VALUE;
        }
       if (sr == mat.length - 1) {
            return mat[sr][sc];
        }
        if(vis[sr][sc] != null)
        {
            return vis[sr][sc];
        }
        // vis[sr][sc]=1;
       int left = func(mat, sr + 1, sc - 1,vis);
        int right = func(mat, sr + 1, sc + 1,vis);
        int down = func(mat, sr + 1, sc,vis);
        return vis[sr][sc]=mat[sr][sc]+Math.max(left,Math.max(down,right));
        
    }
    public int maximumPath(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int max=Integer.MIN_VALUE;
        
            Integer vis[][]=new Integer[n][m];
        for(int i=0;i<m;i++)
        {
            max=Math.max(max,func(mat,0,i,vis));
        }
        return max;
    }
}