//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    static void permutation(StringBuilder str, Set<String> ans, int idx){
        if(idx == str.length()){
            ans.add(str.toString());
            return;
        }
        
        for(int i=idx;i<str.length();i++){
            swap(str, idx, i);
            permutation(str, ans, idx+1);
            swap(str, idx, i);
        }
    }
    
    static void swap(StringBuilder str, int i, int j){
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);

    }

    public ArrayList<String> findPermutation(String s) {
        // Code here
         Set<String> ans=new HashSet<>();
        StringBuilder str = new StringBuilder(s);
        permutation(str, ans, 0);
        ArrayList<String> res = new ArrayList<>(ans);
        Collections.sort(res);
        return res;

    }
}