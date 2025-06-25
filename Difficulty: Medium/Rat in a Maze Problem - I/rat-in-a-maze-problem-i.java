class Solution {
    // Function to find all possible paths
    public void func(int maze[][],int sr,int sc,int n,int vis[][],ArrayList<String>ans,String s)
    {
        if(sr<0 || sc<0 || sr>=n || sc>=n || vis[sr][sc]==1  || maze[sr][sc] ==0)
        {
            return;
        }
        if(sr == n-1 && sc == n-1)
        {
            ans.add(s);
            return;
        }
        vis[sr][sc]=1;
        func(maze,sr+1,sc,n,vis,ans,s+"D");
        func(maze,sr,sc+1,n,vis,ans,s+"R");
        func(maze,sr-1,sc,n,vis,ans,s+"U");
        func(maze,sr,sc-1,n,vis,ans,s+"L");
        vis[sr][sc]=0;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String>ans=new ArrayList<>();
        int n=maze.length;
        int vis[][]=new int[n][n];
        func(maze,0,0,n,vis,ans,"");
        Collections.sort(ans);
        return ans;
    }
}