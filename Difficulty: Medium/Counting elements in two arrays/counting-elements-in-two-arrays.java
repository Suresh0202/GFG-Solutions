class Solution {
    public static int find(int tar,int ar[],int low,int high)
    {
        // int mid=(low+high)/2;
        int ans=ar.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
           if (ar[mid] > tar) {
                ans = mid;        // Possible upper bound
                high = mid - 1;   // Try to find smaller index
            } else {
                low = mid + 1;    // Move right
            }
        }
       return ans;
    }
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        Arrays.sort(b);
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int ele=a[i];
            int as=find(ele,b,0,b.length-1);
            ans.add(as);
        }
        return ans;
        
    }
}