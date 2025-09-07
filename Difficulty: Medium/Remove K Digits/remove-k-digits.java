class Solution {
    public String removeKdigits(String s, int k) {
        // code here
        Stack<Character>st=new Stack<>();
        if(s.length() == k)
        {
            return "0";
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
    if(st.get(0) == '0')
    {
    while(!st.isEmpty()  && st.get(0) == '0')
    {
        st.remove(0);  
    }
    }
    StringBuilder sb=new StringBuilder();
    if(st.isEmpty())return "0";
     for(int i=0;i<st.size();i++)
           {
            sb.append(st.get(i));
           }
        return sb.toString();
    }
}