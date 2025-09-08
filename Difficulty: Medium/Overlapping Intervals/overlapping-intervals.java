class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
                return a[0]-b[0];
            }
        });
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            
            int st1=arr[i][0];
            int ed1=arr[i][1];
            if(!ans.isEmpty() && ans.get(ans.size()-1).get(1) >= ed1)
            {
                continue;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                int st2=arr[j][0];
                int ed2=arr[j][1];
                if(st2 <= ed1)
                {
                    ed1=Math.max(ed2,ed1);
                }else
                {
                    break;
                }
            }
            ans.add(Arrays.asList(st1,ed1));
        }
        // System.out.println(ans);
        ArrayList<int[]>ans1=new ArrayList<>();
        for(List<Integer>a:ans)
        {
            int aa[]={a.get(0),a.get(1)};
            ans1.add(aa);
        }
        return ans1;
    }
}