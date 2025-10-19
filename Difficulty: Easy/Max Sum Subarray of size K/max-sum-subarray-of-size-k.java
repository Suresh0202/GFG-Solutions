class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        int r=0;
        int l=0;
        int n=arr.length;
        int max=0;
        while(r<n)
        {
            sum+=arr[r];
            r++;
            if(r-l == k)
            {
                max=Math.max(max,sum);
                sum-=arr[l];
                l++;
            }
        }
        return max;
    }
}