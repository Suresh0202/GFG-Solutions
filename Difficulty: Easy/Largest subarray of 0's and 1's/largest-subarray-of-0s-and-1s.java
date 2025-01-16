//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int T = Integer.parseInt(br.readLine());

        // Process each test case
        while (T-- > 0) {
            // Read the entire line containing the array elements
            String line = br.readLine();

            // Split the line into an array of strings, then parse them as integers
            String[] tokens = line.split("\\s+");
            int[] a = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }

            // Create the Solution object
            Solution obj = new Solution();

            // Call maxLen function and print the result
            System.out.println(obj.maxLen(a));
        }
    }
}
// } Driver Code Ends


class Solution {
    // public static boolean func(int arr[],int a,int b)
    // {
    //     int oc=0;
    //     int zc=0;
    //     for(int i=a;i<=b;i++)
    //     {
    //         if(arr[i]==1)
    //         {
    //             oc++;
    //         }else
    //         {
    //             zc++;
    //         }
    //     }
    //     return oc==zc;
    // }
    public int maxLen(int[] arr) {
        // Your code here
        int m=0;
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr[i]=-1;
            }
        
        }
        for(int i=0;i<arr.length;i++)
        {
           sum+=arr[i];
           if(sum==0)
           {
               ans=i+1;
           }
           if(mp.get(sum)!=null)
           {
               ans=Math.max(ans,i-mp.get(sum));
           }else
           {
               mp.put(sum,i);
           }
        }
        return ans;
    }
}
