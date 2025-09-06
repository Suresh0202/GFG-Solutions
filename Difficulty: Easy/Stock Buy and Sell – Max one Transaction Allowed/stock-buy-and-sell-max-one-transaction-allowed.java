// User function Template for Java

class Solution {
    public int maximumProfit(int pr[]) {
        // Code here
        int max=0;
        for(int i=0;i<pr.length;i++)
        {
            for(int j=i+1;j<pr.length;j++)
            {
                max=Math.max(max,pr[j]-pr[i]);
            }
        }
        return max;
    }
}