// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] as) {
           // code here
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<N;i++)
        {
            if(as[i] > 0)
            {
                st.push(as[i]);
            }else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(as[i]))
                {
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(as[i]))
                {
                    st.pop();
                }else if(st.isEmpty() || st.peek() < 0)
                {
                    st.push(as[i]);
                }
            }
        }
        int ans[]=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty())
        {
            ans[i--]=st.pop();
        }
        return ans;
    }
}
