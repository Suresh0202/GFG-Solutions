class Solution {
    public boolean divby13(String s) {
        // code here
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int num=s.charAt(i)-'0';
            ans=(ans*10+num)%13;
        }
        return ans==0;

    }
}