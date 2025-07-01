class Solution {
    public boolean isValid(String s,int k)
    {
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']++;
        }
        int cnt=0;
        for(int i=0;i<26;i++)
        {
            if(hash[i] !=0)
            {
                cnt++;
            }
        }
        return cnt==k;
    }
    public int substrCount(String s, int k) {
        // code here
        int r=0;
        int l=0;
        int n=s.length();
        int ans=0;
        StringBuilder sb=new StringBuilder();
        while(r<n)
        {
            sb.append(s.charAt(r));
            if(r-l+1 == k)
            {
                if(isValid(sb.toString(),k-1))
                {
                    ans++;
                }
                sb.deleteCharAt(0);
                l++;
            }
            r++;
        }
        return ans;
        
    }
}