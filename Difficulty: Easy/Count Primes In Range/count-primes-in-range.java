//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            System.out.println(ob.countPrimes(L, R));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    void generate(int arr[])
    {
        Arrays.fill(arr,1);
        arr[0]=0;
        arr[1]=0;
        for(int i=2;i<Math.sqrt(arr.length);i++)
        {
            if(arr[i]==1)
            {
                for(int j=(i*i);j<arr.length;j+=i)
                {
                    arr[j]=0;
                }
            }
        }
    }
    void prefixgen(int pre[],int arr[])
    {
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            pre[i]=pre[i-1]+arr[i];
        }
    }
    int countPrimes(int L, int R) {
         int arr[]=new int[R+1];
        int pre[]=new int[R+1];
        generate(arr);
        prefixgen(pre,arr);

            if(L == 0)
            {
               return (pre[R]);
            }else
            {
                return (pre[R]-pre[L-1]);
            }
    
    }
    
    
};