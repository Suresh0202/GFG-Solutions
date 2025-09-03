class Pair{
    int val;
    int wt;
    Pair(int val,int wt)
    {
        this.val=val;
        this.wt=wt;
    }
}
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int cap) {
        // code here
        TreeMap<Double,List<Pair>>mp=new TreeMap<>(Collections.reverseOrder());
        int n=val.length;
        for(int i=0;i<n;i++)
        {
            double ky=(val[i] * 1.0) / wt[i];
            if(!mp.containsKey(ky))
            {
                mp.put(ky,new ArrayList<>());
            }
            mp.get(ky).add(new Pair(val[i],wt[i]));
        
        }
        double ans=0;
        for(double key:mp.keySet())
        {
            List<Pair>l=mp.get(key);
            for(int i=0;i<l.size();i++)
            {
                int vl=l.get(i).val;
                int wit=l.get(i).wt;
                if(cap >= wit)
                {
                    // System.out.print(vl+ " ");
                    ans= ans + vl;
                    cap=cap-wit;
                }else
                {
                    double x= (vl*1.0/wit)*cap;
                    // System.out.print(cap+" ");
                    ans+=x;
                    cap=0;
                    break;
                    
                }
            }
            if(cap == 0)
            {
                break;
            }
        }
        // System.out.println(mp);
        return ans;
    }
}