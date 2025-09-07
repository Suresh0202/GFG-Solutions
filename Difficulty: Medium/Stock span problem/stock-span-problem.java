
class Solution {
    public int func(int arr[],int idx,int ele)
    {
        int cnt=0;
        for(int i=idx-1;i>=0;i--)
        {
            if(arr[i] <=ele )
            {
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int x=func(arr,i,arr[i]);
            ans.add(x+1);
            
        }
        return ans;
    }
}