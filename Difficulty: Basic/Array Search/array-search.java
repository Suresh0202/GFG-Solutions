class Solution {

    static int search(int arr[], int x) {
        int ans=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                ans=i;
                break;
                
            }
        }
        return ans;
    }
}
