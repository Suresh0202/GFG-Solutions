//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
          HashMap<Character, Integer> map=new HashMap<>();
        int n=s.length(), l=0, max=0;    
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            if(map.containsKey(c) && map.get(c)>=l) {
                l=map.get(c)+1;
            }
            max=Math.max(max, r-l+1);
            map.put(c, r);
        }
    return max;
    }
}