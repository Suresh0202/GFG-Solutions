class Solution {
    public int first(int arr[],int x)
    {
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid] == x)
            {
                ans=mid;
                high=mid-1;
            }else if(arr[mid] < x)
            {
                low=mid+1;
            }else
            {
                high=mid-1;
            }
        }
        return ans;
    }
    public int last(int arr[],int x)
    {
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid] == x)
            {
                ans=mid;
                low=mid+1;
            }else if(arr[mid] <x)
            {
                low=mid+1;
            }else
            {
                high=mid-1;
            }
        }
        return ans;
    }
    
    int countFreq(int arr[], int target) {
        // code here
        int f=first(arr,target);
        if(f == -1 )return 0;
        int l=last(arr,target);
      
        return l-f+1;
    }
}
