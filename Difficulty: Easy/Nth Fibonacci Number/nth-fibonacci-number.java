// User function Template for Java

class Solution {
    public int func(int n){
        if(n <2)
        {
            return n;
        }
        return func(n-1)+func(n-2);
    }
    public int nthFibonacci(int n) {
        // code here
        Integer dp[]=new Integer[n];
        return func(n);
    }
}