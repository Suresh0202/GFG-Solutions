// User function Template for Java

class Solution {
    public long maxSum(Long[] arr) {
        Arrays.sort(arr);
        long tot=0;
        for(int i=0;i<arr.length/2;i++)
        {
            tot-=2*arr[i];
            tot+=2*arr[arr.length-i-1];
        }
        return tot;
        
    }
}
