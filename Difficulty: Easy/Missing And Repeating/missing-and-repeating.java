class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        int hash[]=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            hash[arr[i]]++;
        }
        for(int i=1;i<hash.length;i++)
        {
            if(hash[i] == 2)
            {
                ans.add(i);
            }
            
        }
        for(int i=1;i<hash.length;i++)
        {
            if(hash[i] == 0){
                ans.add(i);
            }
        }
        if(ans.size()  < 2)
        {
            ans.add(max+1);
        }
        return ans;
    }
}
