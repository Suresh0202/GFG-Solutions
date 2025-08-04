class Solution {
    public boolean CanwePlace(int arr[],int cows,int dist)
    {
    int count = 1;  // Place the first cow at the first stall
        int last_pos = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last_pos >= dist) {
                count++;
                last_pos = arr[i]; // Update position of last placed cow
            }
            if (count >= cows) return true;
        }
        return false;
}
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int min=stalls[0];
        int max=stalls[stalls.length-1];
        for(int i:stalls)
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int ans=0;
        int low=1;
        int high=(max-min);
        w
        {
            if(CanwePlace(stalls,k,i))
            {
                ans=i;
            }else
            {
                break;
            }
        }
        return ans;
    }
}