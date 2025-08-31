class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n=arr.length;
         long i=1,j=n-2;
            long sum=0;
            long k=n-2;
            sum+=(arr[0]*n);
            long p=n;
            while(k>0)
            {
                n+=k;
                sum+=(arr[(int)i]*n);
                sum+=(arr[(int)j]*n);
                i++;
                j--;
                k-=2;
            }
            sum+=(arr[(int)p-1]*p);
            if(p%2!=0)
            {
                sum-=(arr[arr.length/2]*n);
            }
            return (int)sum;
    }
}
