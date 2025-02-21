//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    boolean isPrime(int n)
    {
        if(n<2)return false;
        for(int i=2;i<n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public int[] AllPrimeFactors(int N)
    {
        // code here
        List<Integer>ans=new ArrayList<>();
      
        for(int i=1;i<=(N);i++)
        {
            if(N%i == 0)
            {
                if(isPrime(i))
                {
                    ans.add(i);
                }
            }
        }
          int arr[]=new int[ans.size()];
        int j=0;
        for(int i:ans)
        {
            arr[j++]=i;
        }
        return arr;
    }
}