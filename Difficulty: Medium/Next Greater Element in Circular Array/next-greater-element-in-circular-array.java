class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        for(int i=2*n - 1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek() <= arr[i%n])
            {
                st.pop();
            }
            if(i<n)
            {
                if(st.isEmpty())
                {
                    ans.add(-1);
                }else
                {
                ans.add(st.peek());
                }
            }
            st.push(arr[i%n]);
        }
        Collections.reverse(ans);
        return ans;
    }
}