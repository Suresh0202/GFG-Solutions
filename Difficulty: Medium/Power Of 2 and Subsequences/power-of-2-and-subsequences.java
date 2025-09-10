// User function Template for Java
class Solution {
    static int mod=(int)(1e9+7);
    public static boolean isPower(long ele)
    {
        if(ele == 1) return true;
        return  ele > 0 && ((ele & ele-1) == 0);
    }
   
    static Long numberOfSubsequences(int N, ArrayList<Long> A) {
        // Long ans=0;
        long cnt=0;
        for(int i=0;i<A.size();i++)
        {
            if(isPower(A.get(i)))
            {
                cnt++;
            }
        }
        long ans=1;
        for(int i=1;i<=cnt;i++)
        {
            ans=(ans*2)%mod;
            ans=ans%mod;
        }
        // Long ans=(long)Math.pow(2,cnt)%mod;
        // ans=ans%mod;
        return ans-1;
        
    }
}