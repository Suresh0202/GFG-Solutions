class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>fir=new ArrayList<>();
        fir.add(1);
        ans.add(fir);
        for(int i=1;i<n;i++)
        {
            ArrayList<Integer>prev=ans.get(i-1);
            ArrayList<Integer>sec=new ArrayList<>();
            sec.add(1);
            for(int j=0;j<prev.size()-1;j++)
            {
                sec.add(prev.get(j) + prev.get(j+1));
            }
            sec.add(1);
            ans.add(sec);
        }
        // System.out.println(ans);
        return ans.get(n-1);
    }
}