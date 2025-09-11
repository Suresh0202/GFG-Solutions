class Solution {
    public int minJumps(int[] arr) {
        // code here
        int maxreach=0;
        int last=0;
        if(arr.length == 1)
        {
            return 0;
        }
        int jumps=0;
        for(int i=0;i<arr.length;i++)
        {
            maxreach = Math.max(maxreach,arr[i]+i);
            if(i == last)
            {
                if(maxreach == i)
                {
                    jumps=-1;
                    break;
                }
                last=maxreach;
                jumps++;
                if(maxreach >= arr.length-1)
                {
                    break;
                }
            }
        }
        return jumps;
    }
}