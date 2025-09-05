class Solution {
     public static int kadenes(int arr[])
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
           
            if(sum>max)
            {
                max=sum;
            }
             if(sum<0)
            {
                sum=0;
            }
            // max=Math.max(max,sum);
        }
        return max;
    }
    public int maxCircularSum(int arr[]) {
        // code here
        int n=arr.length;
         int normalmax=kadenes(arr);
            int pre[]=new int[n];
            int suf[]=new int[n];
            pre[0]=arr[0];
            int sum=0;
            for(int i=1;i<n;i++)
            {
                pre[i]=pre[i-1]+arr[i];
            }
            suf[n-1]=arr[n-1];
            
            for(int i=n-2;i>=0;i--)
            {
                suf[i]=suf[i+1]+arr[i];
            }
            int max=Integer.MIN_VALUE;
            int premax[]=new int[n];
            int sufmax[]=new int[n];
            premax[0]=pre[0];
            for(int i=1;i<n;i++)
            {
                premax[i]=Math.max(pre[i],premax[i-1]);
            }
            sufmax[n-1]=suf[n-1];
             for(int i=n-2;i>=0;i--)
            {
                sufmax[i]=Math.max(suf[i],sufmax[i+1]);
            }
            // System.out.println(Arrays.toString(sufmax));
            //   System.ou/t.println(Arrays.toString(premax));
            
            for(int i=0;i<n-1;i++)
            {
                int sm=premax[i]+sufmax[i+1];
                max=Math.max(max,sm);
            }
            return Math.max(max,normalmax);
    }
}
