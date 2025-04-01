//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++) list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(list) == true)
                System.out.println("1");
            else
                System.out.println("0");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
        // code here
       int indeg[]=new int[adj.size()];
       for(int i=0;i<adj.size();i++)
       {
           for(int it:adj.get(i))
           {
               indeg[it]++;
           }
       }
       Queue<Integer>qu=new LinkedList<>();
       for(int i=0;i<indeg.length;i++)
       {
           if(indeg[i]==0)
           {
               qu.add(i);
           }
       }
       
       int x=0;
       while(!qu.isEmpty())
       {
           int node=qu.peek();
           qu.remove();
           x++;
           for(int it:adj.get(node))
           {
               indeg[it]--;
               if(indeg[it]==0)
               {
                   qu.add(it);
               }
           }
       }
       return x!=adj.size();
    }
}