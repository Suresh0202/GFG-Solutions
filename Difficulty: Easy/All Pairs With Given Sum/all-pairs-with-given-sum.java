// User function Template for Java
class Solution {
    public List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
           
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]  == target)
                {
                     List<Integer>a=new ArrayList<>();
                    a.add(i);
                    a.add(j);
                    ans.add(a);
                    
                }
            }
        }
        return ans;
    }
}
