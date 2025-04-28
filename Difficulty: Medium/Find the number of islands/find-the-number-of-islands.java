//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] grid = new char[n][m];

            // Read the grid input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.next().charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.countIslands(grid);
            System.out.println(ans);
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    public void dfs(int sr,int sc,char grid[][],int vis[][])
    {
        if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length || vis[sr][sc] != -1 )
        {
            return;
        }
        if(vis[sr][sc]==-1 && grid[sr][sc]=='L')
        {
            vis[sr][sc]=1;
            dfs(sr-1,sc,grid,vis);
            dfs(sr+1,sc,grid,vis);
            dfs(sr,sc-1,grid,vis);
            dfs(sr,sc+1,grid,vis);
            dfs(sr-1,sc-1,grid,vis);
            dfs(sr+1,sc+1,grid,vis);
            dfs(sr-1,sc+1,grid,vis);
            dfs(sr+1,sc-1,grid,vis);
        }
    }
    public int countIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(vis[i],-1);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 'L' && vis[i][j]==-1)
                {
                    ans++;
                    dfs(i,j,grid,vis);
                }
            }
        }
        return ans;
        
    }
}