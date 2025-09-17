class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int n=arr.length;
        n=n/2;
        for(int key:mp.keySet())
        {
            if(mp.get(key) > n)
            {
                return key;
            }
        }
        return -1;
    }
}