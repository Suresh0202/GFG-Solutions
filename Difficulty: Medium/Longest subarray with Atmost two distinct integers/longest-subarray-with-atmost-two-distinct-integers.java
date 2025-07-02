class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer,Integer>mp=new HashMap<>();
        int l=0;
        int r=0;
        int n=arr.length;
        int ans=0;
        while(r<n)
        {
            mp.put(arr[r],mp.getOrDefault(arr[r],0)+1);
            while(mp.size() >2)
            {   
               
                mp.put(arr[l],mp.get(arr[l])-1);
                if(mp.get(arr[l]) == 0)
                {

                mp.remove(arr[l]);
                }                
                l++;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}