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
        TreeMap<Integer,List<Pair>>mp=new TreeMap<>();
        for(int i=0;i<start.length;i++)
        {
            int st=start[i];
            int ed=end[i];
            if(!mp.containsKey(ed))
            {
                mp.put(ed,new ArrayList<>());
            }
            mp.get(ed).add(new Pair(st,ed));
            
        }
        int cnt=0;
        // System.out.println(mp);
              int prev = Integer.MIN_VALUE; // ✅ key fix

        for(int key:mp.keySet())
        {
            List<Pair>l=mp.get(key);
            for(int i=0;i<l.size();i++)
            {
                int st=l.get(i).st;
                int ed=l.get(i).ed;
                if(prev < st)
                {
                    cnt++;
                    prev=ed;
                    break;
                }
            }
            
        }
        return cnt;
    }
}
