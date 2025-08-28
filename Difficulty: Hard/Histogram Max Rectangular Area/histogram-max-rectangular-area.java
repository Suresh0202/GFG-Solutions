class Solution {
    public static int[] findleft(int arr[])
    {
        int ans[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i]=-1;
            }else
            {
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static int[] findright(int arr[])
    {
        int ans[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i]=arr.length;
            }else
            {
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static int getMaxArea(int arr[]) {
        // your code here
        int ans=0;
        int n=arr.length;
        int left[]=new int[n];
        left=findleft(arr);
        int right[]=new int[n];
        right=findright(arr);
        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,(right[i]-left[i]-1)*arr[i]);
        }
        return ans;
    }
}
