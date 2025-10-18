class Solution {
    int missingNum(int arr[]) {
        // code here
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            st.add(arr[i]);
        }
        for(int i=1;i<=arr.length;i++)
        {
            if(!st.contains(i))
            {
                return i;
            }
        }
        return arr.length+1;
    }
}