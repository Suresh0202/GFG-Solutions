//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.findCatalan(n);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int findCatalan(int n) {
        // code here
        int arr[]=new int[n+1];
		arr[0]=1;
		arr[1]=1;
// 		int sum=0;
		for(int i=2;i<arr.length;i++)
		{
		    for(int j=0;j<i;j++)
		    {
		        arr[i]+=(arr[j]*arr[i-j-1]);
		      //  sum+=arr[i];
		    }
		    
		}
        return arr[n];
    }
}
