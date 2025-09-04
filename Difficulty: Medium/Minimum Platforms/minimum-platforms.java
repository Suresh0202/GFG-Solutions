class Pair{
    int val;
    char ch;
    Pair(int val,char ch)
    {
        this.val=val;
        this.ch=ch;
    }
    
}
class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        List<Pair>li=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            li.add(new Pair(arr[i],'A'));
            li.add(new Pair(dep[i],'D'));
        }
        Collections.sort(li, (a, b) -> {
    if (a.val == b.val) {
        return a.ch - b.ch;  // 'D' comes before 'A' since 'D' < 'A' in ASCII
    }
    return a.val - b.val;
});

        int cnt=0;
        int max=0;
        for(Pair p:li)
        {
            // int val=p.val;
            char dp=p.ch;
            if(dp == 'A')
            {
                cnt++;
            }else if(dp == 'D'){
                cnt--;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}
