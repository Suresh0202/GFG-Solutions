//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            obj.sieve();
            List<Integer> ans = obj.findPrimeFactors(n);
            for (int e : ans) {
                System.out.print(e + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // You must implement this function
//   static int arr[]=new int[(int)1e6];
    static void sieve() {
        // Arrays.fill(arr,1);
        // arr[0]=0;
        // arr[1]=0;
        // for(int i=2;(i*i)<arr.length;i++)
        // {
        //     if(arr[i] == 1)
        //     {
        //         for(int j=(i*i);j<arr.length;j+=i)
        //         {
        //             arr[j]=0;
        //         }
        //     }
        // }
        

    }

    static List<Integer> findPrimeFactors(int N) {
        // code here
        List<Integer>ans=new ArrayList<>();
        int k=N;
        for(int i=2;i<=k;i++)
        {
            while(k%i==0)
            {
                // / System.out.print(i+" ");
                    ans.add(i);
                    k=k/i;
                    
                
            }
        }
        if(k>1)
        {
            ans.add(k);
        }
        return ans;
        
    }
}
