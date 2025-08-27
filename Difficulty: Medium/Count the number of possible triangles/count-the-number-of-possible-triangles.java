class Solution {
    public int b_s(int arr[],int low,int high,int tar)
    {
        int ans=low-1;
        while(low <= high)
        {
        int mid=(low+high)/2;
            if(arr[mid] < tar)
            {
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int cnt=0;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++)
            {
                int sum=arr[i]+arr[j];
                int k=n-1;
                int idx=b_s(arr,j+1,n-1,sum);
                if(idx > j){
                cnt+=(idx-j);
                    
                }
            }
            
        }
        return cnt;
    }
}