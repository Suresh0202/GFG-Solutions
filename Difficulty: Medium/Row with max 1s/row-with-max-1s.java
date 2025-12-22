// User function Template for Java

class Solution {
     private int func1(int[] arr, int L, int R, int x) {
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

private int func2(int[] arr, int L, int R, int x) {
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
    public int rowWithMax1s(int arr[][]) {
        // code here
        int ans=0;
        int fn=0;
        int n=arr.length;
        int m=arr[0].length;
       for (int i = 0; i < n; i++) {
            int fir = func1(arr[i], 0, m - 1, 1);
            if (fir == -1) continue; // ❗ skip rows with no 1s

            int sec = func2(arr[i], 0, m - 1, 1);
            int count = sec - fir + 1;

            if (count > ans) {
                ans = count;
                fn = i;
            }
        }
        return fn;
        
        
    }
}