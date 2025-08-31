class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        PriorityQueue<Integer>min=new PriorityQueue<>();;
        PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Double>ans1=new ArrayList<>();
        for(int num:arr)
        {
             if(max.isEmpty() || max.peek() >= num)
        {
            max.add(num);
        }else
        {
            min.add(num);
        }
        if(max.size() > min.size()+1)
        {
            min.add(max.poll());
        }else if(max.size() < min.size())
        {
            max.add(min.poll());
        }
        
         if(max.size()  == min.size())
        {
            double ans=(max.peek()+min.peek());
            ans=ans/2;
            ans1.add(ans);
            // return ans;
        }
        else
        {
            ans1.add((double)max.peek());
        }
        // return max.peek();
        }
        return ans1;
    }
}