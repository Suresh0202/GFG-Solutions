// User function Template for Java

class Solution {
    public static  int func(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            res+=func(i)*func(n-i-1);
        }
        return res;
    }
    static int count(int N) {
        // code here
        return func(N/2);
    }
};