class Pair{
    int st,ed;
    Pair(int st,int ed)
    {
        this.st=st;
        this.ed=ed;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        List<Pair>ar=new ArrayList<>();
        for(int i=0;i<start.length;i++)
        {
            int st=start[i];
            int ed=end[i];
            ar.add(new Pair(st,ed));
            
        }
        int cnt=0;
        // System.out.println(mp);
              int prev = Integer.MIN_VALUE; 
        Collections.sort(ar,(a,b)->a.ed-b.ed);
        
        for(Pair p:ar)
        {
            int st=p.st;
            int ed=p.ed;
            if(prev < st)
            {
                cnt++; 
                prev=ed;
                // break;
            }
        }
        return cnt;
    }
}
