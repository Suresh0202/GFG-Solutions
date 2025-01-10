//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            ArrayList<Integer> ans = new Solution().countDistinct(arr, k);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            t--;
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    ArrayList<Integer> countDistinct(int A[], int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int n=A.length;
        int j = 0;
        while (j < n) {
            hm.put(A[j], hm.getOrDefault(A[j], 0) + 1);
            
            if (j-i+1 < k) {
                
                j++;
            } else if(j-i+1 == k) {
                arr.add(hm.size());
                
                if (hm.get(A[i]) == 1) {
                    hm.remove(A[i]);
                } else {
                    int value = hm.get(A[i]);
                    hm.put(A[i], value-1);
                }
                
                //last part
                i++;
                j++;
            }
        }
        return arr;
    }
}
