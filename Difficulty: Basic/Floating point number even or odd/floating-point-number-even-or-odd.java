//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String s = read.readLine().trim(); 
            Solution obj = new Solution();
            if(obj.isEven(s,n))
                System.out.println("EVEN");
            else
                System.out.println("ODD");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean isEven(String s,int n) 
    { 
        // code here
        StringBuilder sb=new StringBuilder();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='.')
            {
                ans=i;
                break;
            }
        }
        for(int i=ans+1;i<n;i++)
        {
            if((i == ans+1) && s.charAt(i)=='0')
            {
                sb.append(""+s.charAt(i));
            }else if((i != ans+1) && s.charAt(i)=='0')
            {
                
            }else
            {
                sb.append(""+s.charAt(i));
            }
        }
        int x=sb.charAt(sb.length()-1)-'0';
        if(x==0)
        {
            int y=s.charAt(ans-1)-'0';
            return y%2==0;
        }
        // System.out.println(x);
        return x%2==0;
        // System.out.println(sb);
        // return true;
    }
} 