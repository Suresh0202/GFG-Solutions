// User function Template for Java

class Solution {
    static int func(int arr[],int k)
    {
        int l=0,r=0,n=arr.length,cnt=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        while(r<n)
        {
            mp.put(arr[r],mp.getOrDefault(arr[r],0)+1);
            while(mp.size() > k)
            {
                mp.put(arr[l],mp.get(arr[l])-1);
                if(mp.get(arr[l]) == 0)
                {
                    mp.remove(arr[l]);
                }
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    static int exactlyK(int arr[], int k) {
        // code here
        
        return func(arr,k)-func(arr,k-1);
    }
}
