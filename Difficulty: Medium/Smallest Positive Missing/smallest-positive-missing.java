class Solution {
    public int missingNumber(int[] arr) {
        // code here
        HashSet<Integer>st=new HashSet<>();
        int max=0;
        for(int i:arr)
        {
            if(i>0)
            {
                st.add(i);
            }
            max=Math.max(max,i);
        }
        for(int i=1;i<=arr.length;i++)
        {
            if(!st.contains(i))
            {
                return i;
            }
        }
        return max+1;
        
    }
}
