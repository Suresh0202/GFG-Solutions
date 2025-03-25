//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Pair{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public boolean detect(int src,int vis[],ArrayList<ArrayList<Integer>> adj)
    {
        vis[src]=1;
        Queue<Pair>qu=new LinkedList<>();
        qu.add(new Pair(src,-1));
        while(!qu.isEmpty())
        {
            int node=qu.peek().first;
            int parent=qu.peek().second;
            qu.remove();
            for(int i:adj.get(node))
            {
                if(vis[i]==0)
                {
                    vis[i]=1;
                    qu.add(new Pair(i,node));
                }
                else if(parent != i)
                {
                    return true;
                }
            }
        }
        return false;
        
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int vis[]=new int[adj.size()];
        for(int i=0;i<vis.length;i++)
        {
            if(vis[i]==0)
            {
                if(detect(i,vis,adj))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}