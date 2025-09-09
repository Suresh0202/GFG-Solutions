class Solution {
    public int[] sieve(int n) {
        // code here
        int isPrime[]=new int[n+1];
        isPrime[0]=-1;
        isPrime[1]=-1;
        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i] != -1)
            {
                for(int j=i+i;j<=n;j+=i)
                {
                    isPrime[j]=-1;
                }
            }
        }
        List<Integer>ans=new ArrayList<>();
        // System.out.println
        //int ans[]=new int[n];
        for(int i=0;i<=n;i++)
        {
            if(isPrime[i] != -1)
            {
                ans.add(i);
            }
        }
        int ans1[]=new int[ans.size()];
        int k=0;
        for(int i:ans)
        {
            ans1[k++]=i;
        }
        return ans1;
    }
}