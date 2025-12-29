class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        // int res[]=new int[(a.length+b.length)];
        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        int j=0;
        int n=a.length;
        int x=0;
        int m=b.length;
        while(i<n && j < m)
        {
            if(a[i] <= b[j])
            {
                res.add(a[i++]);
                // i++;
            }else
            {
                res.add(b[j++]);
                // j++;
            }
        }
        while(i<n)
        {
            res.add(a[i++]);
            // i++;
        }
        while(j<m)
        {
            res.add(b[j++]);
            // j++;
        }
        // System.out.println(Arrays.toString(res));
        return res.get(k-1);
    }
}