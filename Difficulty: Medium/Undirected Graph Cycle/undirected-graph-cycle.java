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


class Solution {
    public boolean detect(ArrayList<ArrayList<Integer>> adj,int vis[],int v)
    {
       
        Queue<int []>qu=new LinkedList<>();
         vis[v]=1;
      qu.add(new int[]{v, -1});
        while(!qu.isEmpty())
        {
            int x[]=qu.poll();
            int node=x[0];
            int parent=x[1];
            
            for(int i:adj.get(node))
            {
                if(vis[i]==0)
                {
                    vis[i]=1;
                    qu.add(new int[]{i, node});
                }
                else if(i != parent)
                {
                    return true;
                }
                // vis[i]=1;
                // qu.add(i);
            }
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {

            int vis[]=new int[adj.size()];
           for(int i=0;i<adj.size();i++)
           {
               if(vis[i]!=1)
               {
                   if(detect(adj,vis,i))
                   {
                       return true;
                   }
               }
           }
            return false;
            
    }
}