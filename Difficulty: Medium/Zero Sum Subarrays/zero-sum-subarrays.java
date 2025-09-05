class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            int pre=sum;
            if(mp.containsKey(pre))
            {
                cnt+=mp.get(pre);
            }
            mp.put(pre,mp.getOrDefault(pre,0)+1);
        }
        return cnt;
    }
}
