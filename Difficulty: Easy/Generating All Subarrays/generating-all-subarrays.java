// User function Template for Java
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        
        List<List<Integer>>ans=new ArrayList<>();
        int n=arr.length;
         for(int i = 0; i < n; i++)
        {
            for(int j = i; j<n; j++)
            {
                List<Integer> sub = new ArrayList<>();
                for(int k = i; k <= j; k++)
                {
                    sub.add(arr[k]);
                }
                ans.add(sub);
            }
        }
        return ans;
    }
}