// User function Template for Java

class Solution {
    

    static int shotestPath(int[][] mat, int n, int m, int k) {
        // code here
        Queue<int[]>qu=new LinkedList<>();
        qu.add(new int[]{0,0,0,0});
        int vis[][][]=new int[n][m][k+1];
        vis[0][0][0]=1;
        while(!qu.isEmpty())
        {
            int arr[]=qu.poll();
            int sr=arr[0];
            int sc=arr[1];
            int walls=arr[2];
            int dist=arr[3];
            if(sr == n-1 && sc == m-1)
            {
                return dist;
            }
           if(sr+1>=0 && sc>=0 && sr+1<n && sc<m)
           {
               int nw=0;
               if(mat[sr+1][sc] == 1)
               {
                   nw=walls+1;
               }else
               {
                   nw=walls;
               }
               if(nw <= k && vis[sr+1][sc][nw] != 1)
               {
                   qu.add(new int[]{sr+1,sc,nw,dist+1});
                   vis[sr+1][sc][nw]=1;
               }
           }
           if(sr>=0 && sc+1>=0 && sr<n && sc+1<m)
           {
               int nw=0;
                if(mat[sr][sc+1] == 1)
               {
                   nw=walls+1;
               }else
               {
                   nw=walls;
               }
               if(nw <= k && vis[sr][sc+1][nw] != 1)
               {
                   qu.add(new int[]{sr,sc+1,nw,dist+1});
                   vis[sr][sc+1][nw]=1;
               }
           }
           if(sr>=0 && sc-1>=0 && sr<n && sc-1<m)
           {
               int nw=0;
                if(mat[sr][sc-1] == 1)
               {
                   nw=walls+1;
               }else
               {
                   nw=walls;
               }
               if(nw <= k && vis[sr][sc-1][nw] != 1)
               {
                   qu.add(new int[]{sr,sc-1,nw,dist+1});
                   vis[sr][sc-1][nw]=1;
               }
           }
           if(sr-1>=0 && sc>=0 && sr-1<n && sc<m)
           {
               int nw=0;
                if(mat[sr-1][sc] == 1)
               {
                   nw=walls+1;
               }else
               {
                   nw=walls;
               }
               if(nw <= k && vis[sr-1][sc][nw] != 1)
               {
                   qu.add(new int[]{sr-1,sc,nw,dist+1});
                   vis[sr-1][sc][nw]=1;
               }
           }
        }
        return -1;
    }
    
};