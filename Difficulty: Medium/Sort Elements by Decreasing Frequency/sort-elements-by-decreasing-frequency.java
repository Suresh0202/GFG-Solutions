// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer>h1=new HashMap<>();
        for(int ele:arr)
        {
            h1.put(ele,h1.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int ele:arr)
        {
            ans.add(ele);
        }
        Collections.sort(ans,(a,b)->{
            int freqa=h1.get(a);
            int freqb=h1.get(b);
            if(freqa!=freqb)
            {
                return freqb-freqa;
            }
            else
            {
                return a-b;
                
            }
        });
        return ans;
    }
    
    
}