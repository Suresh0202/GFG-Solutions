class Solution {
    public int findMoves(int[] chairs, int[] pass) {
        // code here
        Arrays.sort(chairs);
        Arrays.sort(pass);
        int ans=0;
        for(int i=0;i<chairs.length;i++)
        {
            ans+=(Math.abs(chairs[i]-pass[i]));
        }
        return ans;
        
    }
}
