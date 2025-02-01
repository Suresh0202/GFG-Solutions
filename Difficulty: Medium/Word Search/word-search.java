//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] mat = new char[n][m];

            // Reading the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.next().charAt(0);
                }
            }

            String word = sc.next();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(mat, word);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
      static boolean matched(char[][] mat, String word, int x, int y, int idx){
        int len=word.length();
        int rows=mat.length;
        int cols=mat[0].length;
        if(idx==len){
            return true;
        }
        if(x<0 || y<0 || x>=rows || y>=cols) return false;
        if(mat[x][y] == word.charAt(idx)){
            char temp=mat[x][y];
            mat[x][y]='#';
            boolean res=matched(mat, word, x-1, y, idx+1) || matched(mat, word, x+1,y, idx+1) || matched(mat, word, x, y-1, idx+1) || matched(mat, word, x, y+1, idx+1);
            mat[x][y]=temp;
            return res;
        }
        return false;
}

    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
         int len=word.length();
        int rows=mat.length;
        int cols=mat[0].length;
        if(len>rows*cols){
            return false;
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j] == word.charAt(0)){
                    if(matched(mat, word, i, j, 0)){
                        return true;
                    }
                }
            }
        }
        return false;

    }
}