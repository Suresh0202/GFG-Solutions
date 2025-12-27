class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                pq.add(mat[i][j]);
            }
        }
        int c=0;
         int ans=0;
         while(c!=k)
         {
            ans=pq.poll();
            c++;
         }
         return ans;
        // retur;
    }
}
