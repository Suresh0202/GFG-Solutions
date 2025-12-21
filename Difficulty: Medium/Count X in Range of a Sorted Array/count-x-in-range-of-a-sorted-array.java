class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        for(int a[]:queries)
        {
            int l=a[0];
            int r=a[1];
            int tar=a[2];
            int firOc=func(arr,l,r,tar);
            int lasOc=func1(arr,l,r,tar);
            if(firOc == -1 || lasOc == -1)ans.add(0);
            else ans.add(lasOc-firOc+1);
        }
        return ans;
        
    }
    private int func(int[] arr, int L, int R, int x) {
    int result = -1;
    while(L <= R){
        int mid = L + (R - L)/2;
        if(arr[mid] == x){
            result = mid;
            R = mid - 1;  // Look left for earlier occurrence
        } else if(arr[mid] < x){
            L = mid + 1;
        } else {
            R = mid - 1;
        }
    }
    return result;
}

private int func1(int[] arr, int L, int R, int x) {
    int result = -1;
    while(L <= R){
        int mid = L + (R - L)/2;
        if(arr[mid] == x){
            result = mid;
            L = mid + 1;  // Look right for later occurrence
        } else if(arr[mid] < x){
            L = mid + 1;
        } else {
            R = mid - 1;
        }
    }
    return result;
}



}