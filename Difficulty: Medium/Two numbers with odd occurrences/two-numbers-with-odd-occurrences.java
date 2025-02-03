//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
   
    public int[] twoOddNum(int arr[], int N)
    {
        // code here
        int xor=0;
        for(int num:arr)
        {
            xor=xor^num;
        }
        int a=0,b=0;
     
        int rig=xor & (-xor);
        for(int i=0;i<N;i++)
        {
            if((arr[i] & rig)!=0)
            {
                a=a^arr[i];
            }else
            {
                b=b^arr[i];
            }
        }
        int p[]=new int[2];
        if(a>b)
        {
            p[0]=a;
            p[1]=b;
        }else
        {
            p[0]=b;
            p[1]=a;
        }
        
        return p;
    }
}