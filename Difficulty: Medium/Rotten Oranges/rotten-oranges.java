class Pair{
    int sr,sc,val;
    Pair(int sr,int sc,int val)
    {
        this.sr=sr;
        this.sc=sc;
        this.val=val;
    }
}
class Solution {
    public boolean isCorrect(int i,int j,int vis[][],int mat[][],int n,int m)
    {
        if(i>=n || j>=m || i<0 || j<0 || mat[i][j] == 0 || vis[i][j] == 2)
        {
            return false;
        }
        return true;
    }
    public int orangesRotting(int[][] mat) {
        // Code here
        Queue<Pair>qu=new LinkedList<>();
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j] == 2)
                {
                    qu.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }

            }
        }
        int ans=0;
        while(!qu.isEmpty())
        {
            int i=qu.peek().sr;
            int j=qu.peek().sc;
            int val=qu.peek().val;
            ans=val;
            qu.poll();
            if(isCorrect(i,j+1,vis,mat,n,m))
            {
                qu.add(new Pair(i,j+1,val+1));
                vis[i][j+1]=2;
            }
            if(isCorrect(i,j-1,vis,mat,n,m))
            {
                qu.add(new Pair(i,j-1,val+1));
                vis[i][j-1]=2;
            }
            if(isCorrect(i-1,j,vis,mat,n,m)){
                qu.add(new Pair(i-1,j,val+1));
                vis[i-1][j]=2;
            }
            if(isCorrect(i+1,j,vis,mat,n,m))
            {
                qu.add(new Pair(i+1,j,val+1));
                vis[i+1][j]=2;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j] == 1 && vis[i][j] != 2)
                {
                    return -1;
                }
            }
        }
        return ans;
        
        
    }
}