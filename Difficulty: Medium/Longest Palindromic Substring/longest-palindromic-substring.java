class Solution {
    public String getLongestPal(String s) {
        // code here
            int n=s.length();
            String ans="";
            for(int i=0;i<n;i++)
            {
                int st=i;
                int ed=i;
                while(st>=0 && ed<n)
                {
                    if(s.charAt(st) != s.charAt(ed))
                    {
                        break;
                    }
                    st--;
                    ed++;
                }
                if(ans.length() < (ed-st-1))
                {
                    ans=s.substring(st+1,ed);
                }
                st=i;
                ed=i+1;
                 while(st>=0 && ed<n)
                {
                    if(s.charAt(st) != s.charAt(ed))
                    {
                        break;
                    }
                    st--;
                    ed++;
                }
                if(ans.length() < (ed-st-1))
                {
                    ans=s.substring(st+1,ed);
                }
                
            }
            return ans;
    }
}