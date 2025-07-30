class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low < high)
        {
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j)
        {
            while(arr[i]<=pivot && i<=high-1)
            {
                i++;
            }
            while(arr[j]>pivot && j>=low-1)
            {
                j--;
            }
            if(i<j)
            {
                int tm=arr[j];
                arr[j]=arr[i];
                arr[i]=tm;
            }
        }        // code here
        int tm=arr[low];
        arr[low]=arr[j];
        arr[j]=tm;
        return j;
    }
}