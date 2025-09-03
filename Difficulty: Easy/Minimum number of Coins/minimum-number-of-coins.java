class Solution {
    public int findMin(int n) {
        // code here
        int arr[]={1,2,5,10};
        int i=3;
        int cnt=0;
        while(n != 0)
        {
            if(n >= arr[i])
            {
                n-=arr[i];
                cnt++;
            }else
            {
                i--;
            }
        }
        return cnt;
    }
}
