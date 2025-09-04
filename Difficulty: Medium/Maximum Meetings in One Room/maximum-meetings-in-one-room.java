class Pair{
    int st,ed,pos;
    Pair(int st,int ed,int pos)
    {
        this.st=st;
        this.ed=ed;
        this.pos=pos;
    }
}
class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] start, int[] end) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
         TreeMap<Integer,List<Pair>>mp=new TreeMap<>();
        for(int i=0;i<start.length;i++)
        {
            int st=start[i];
            int ed=end[i];
            if(!mp.containsKey(ed))
            {
                mp.put(ed,new ArrayList<>());
            }
            mp.get(ed).add(new Pair(st,ed,i));
            
        }
     int prev = Integer.MIN_VALUE; 

        for(int key:mp.keySet())
        {
            List<Pair>l=mp.get(key);
            for(int i=0;i<l.size();i++)
            {
                int st=l.get(i).st;
                int ed=l.get(i).ed;
                int pos=l.get(i).pos;
                if(prev < st)
                {
                    // cnt++;
                    ans.add(pos+1);
                    prev=ed;
                    break;
                }
            }
            
        }
        Collections.sort(ans);
        return ans;
    }
}
