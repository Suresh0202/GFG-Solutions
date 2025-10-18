class Solution {
    int stockBuySell(int arr[]) {
        // code here
         int ans=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) ans+=(arr[i]-arr[i-1]);
        }
        return ans;
    }
}
