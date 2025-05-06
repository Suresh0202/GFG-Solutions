//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.upperBound(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int func(int arr[],int k,int low,int high)
    {
        int ans=arr.length;
        while(low<= high)
        {
            int mid=(low+high)/2;
            if(arr[mid] <= k)
            {
                low=mid+1;
            }else
            {
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
        
    }
    int upperBound(int[] arr, int target) {
        // code here
        
        
        int ans=func(arr,target,0,arr.length-1);
        return ans;
    }
}
