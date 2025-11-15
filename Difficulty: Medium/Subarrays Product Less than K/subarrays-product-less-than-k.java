// User function Template for Java

class Solution {

    public long countSubArrayProductLessThanK(long arr[], int n, long k) {
         int start=0;
        int end=0;
        long prod=1;
        long count=0;
        while(end<n)
        {
            prod=prod*arr[end];
            while(prod>=k && start<=end)
            {
                prod=prod/arr[start];
                start++;
            }
            count += (end - start + 1);
            end++;
        }
        return count;
    }
}