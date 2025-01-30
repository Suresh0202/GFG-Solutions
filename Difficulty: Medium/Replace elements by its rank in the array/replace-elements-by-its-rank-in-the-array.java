//{ Driver Code Starts
//Initial Template for Java

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
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans[] = obj.replaceWithRank(a,n);
      for(int e : ans)
      System.out.print(e+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        int ans[]=new int[N];
        int brr[]=arr.clone();
        
        Arrays.sort(arr);
        HashMap<Integer,Integer>mp=new HashMap<>();
		mp.put(arr[0],1);
        int c=1;
       	for(int i=1;i<arr.length;i++)
		{
		    if(arr[i-1]<arr[i])
		    {
		        c++;
		        mp.put(arr[i],c);
		    }else{
		      //  System.out.println(c);
		       mp.put(arr[i],c);
		    }
		}
			
		   for(int i=0;i<N;i++)
		   {
		       int p=brr[i];
		       ans[i]=mp.get(p);
		   }
		return ans;
		

  }
}
     