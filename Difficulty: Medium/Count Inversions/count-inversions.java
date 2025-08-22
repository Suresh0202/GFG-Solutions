class Solution {
    static int merge(int arr[],int low,int high)
    {
        if(low < high)
        {
           
        
        int cnt=0;
        int mid=(low+high)/2;
        cnt+= merge(arr,low,mid);
        cnt+=merge(arr,mid+1,high);
        cnt+=mergesort(arr,low,mid,high);
        return cnt;
    
        }
        return 0;
    }
    public static int mergesort(int arr[],int low,int mid,int high)
    {
        int left=low;
        int right=mid+1;
        int cnt=0;
        List<Integer>temp=new ArrayList<>();
        while(left <= mid && right <= high)
        {
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }else
            {
                cnt+=(mid-left+1);
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right <= high)
        {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }
        return cnt;
    }
    static int inversionCount(int arr[]) {
        // Code Here
        int n=arr.length;
       int ans=merge(arr,0,n-1);
       return ans;
    }
}