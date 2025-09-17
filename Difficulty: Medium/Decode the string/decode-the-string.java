class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Integer>st=new Stack<>();
        Stack<String>st1=new Stack<>();
        String ans="";
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                k=k*10+(ch-'0');
            }else if(ch == '[')
            {
                st1.push(ans);
                ans="";
                st.push(k);
                k=0;
            }else if(ch == ']')
            {
                int rep=st.pop();
                String prev=st1.pop();
                StringBuilder sb=new StringBuilder(prev);
                for(int j=0;j<rep;j++)
                {
                    sb.append(ans);
                }
                ans=sb.toString();
            }else
            {
                ans+=ch;
            }

        }
        return ans;
    }
}