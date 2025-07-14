class Solution {
    public int missingNumber(int[] arr) {
        // code here
        HashSet<Integer>st=new HashSet<>();
        for(int i:arr)
        {
            if(i>0)
            {
                st.add(i);
            }
            
        }
        int c=0;
        for(int i=1;i<=arr.length;i++)
        {
            if(!st.contains(i))
            {
                return i;
            }
            c++;
        }
        // if(c )
        return arr.length+1;
    }
}
