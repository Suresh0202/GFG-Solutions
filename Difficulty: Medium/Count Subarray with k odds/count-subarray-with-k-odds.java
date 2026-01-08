class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        int ans=0;
        int pre=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] %2 == 1)
            {
                pre++;
            }
             ans += mp.getOrDefault(pre - k, 0);
              mp.put(pre, mp.getOrDefault(pre, 0) + 1);

            
        }
        return ans;
        
    }
}
