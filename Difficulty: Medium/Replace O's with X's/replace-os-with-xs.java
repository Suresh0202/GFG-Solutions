// User function Template for Java

class Solution {
    public static void dfs(char mat[][],int sr,int sc,int vis[][])
    {
        if(sr<0 || sc<0 || sr>=mat.length || sc>=mat[0].length || mat[sr][sc] == 'X' || vis[sr][sc] == -1)
        {
            return;
        }
        vis[sr][sc]=-1;
        dfs(mat,sr+1,sc,vis);
        dfs(mat,sr,sc+1,vis);
        dfs(mat,sr-1,sc,vis);
        dfs(mat,sr,sc-1,vis);
    }
    static char[][] fill(char mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<m;i++)
        {
            if(mat[0][i] == 'O')
            {
                dfs(mat,0,i,vis);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(mat[i][m-1] == 'O')
            {
                dfs(mat,i,m-1,vis);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(mat[i][0] == 'O')
            {
                dfs(mat,i,0,vis);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(mat[n-1][i] == 'O'){
                dfs(mat,n-1,i,vis);
            }
        }
        
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<m;j++)
           {
               if(vis[i][j] != -1)
               {
                   mat[i][j]='X';
               }else
               {
                   mat[i][j]='O';
               }
           }
        }
        return mat;
    }
}