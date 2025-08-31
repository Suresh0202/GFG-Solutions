

// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int max=0;
        int i=0,j=arr.length-1;
        while(i<j)
        {
            int ht=Math.min(arr[i],arr[j]);
            int wd=j-i;
            max=Math.max(max,ht*wd);
            if(arr[i]<arr[j])
            {
                i++;
            }else
            {
                j--;
            }
        }
        return max;
    }
}