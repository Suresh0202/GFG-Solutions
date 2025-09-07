class Solution {
    public void func(int image[][],int sr,int sc,int n,int m,int nw,int vis[][],int org)
    {
        if(sr<0 || sc<0 || sc>=m || sr>=n || vis[sr][sc] == -1 || image[sr][sc] != org )
        {
            return;
        }
        vis[sr][sc]=-1;
        func(image,sr+1,sc,n,m,nw,vis,org);
        func(image,sr-1,sc,n,m,nw,vis,org);
        func(image,sr,sc+1,n,m,nw,vis,org);            
        func(image,sr,sc-1,n,m,nw,vis,org);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int n=image.length;
        int m=image[0].length;
        int vis[][]=new int[n][m];
        int org=image[sr][sc];
        func(image,sr,sc,n,m,newColor,vis,org);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j] == -1)
                {
                    image[i][j]=newColor;
                }
            }
        }
        return image;
    }
}