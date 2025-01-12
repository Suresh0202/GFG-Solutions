//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int[] prefixmax(int ar[])
    {
        int pre[]=new int[ar.length];
        pre[0]=ar[0];
        for(int i=1;i<ar.length;i++)
        {
                pre[i]=Math.max(pre[i-1],ar[i]);
        }
        return pre;
    }
     public static int[] suffixmax(int ar[])
    {
        int pre[]=new int[ar.length];
        pre[ar.length-1]=ar[ar.length-1];
        for(int i=ar.length-2;i>=0;i--)
        {
                pre[i]=Math.max(pre[i+1],ar[i]);
        }
        return pre;
    }
     public static int findans(int pre[],int suf[],int h[])
    {
        int ans=0;
        for(int i=0;i<h.length-1;i++)
        {
            int lf=pre[i];
            int rm=suf[i];
            if(lf > h[i] && rm>h[i])
            {
                ans+=Math.min(lf,rm)-h[i];
            }
        }
        return ans;
    }
    public int maxWater(int height[]) {
        // code here
        
        int pref[]=prefixmax(height);
        int suff[]=suffixmax(height);
        int ans=findans(pref,suff,height);
        return ans;
    }
}
