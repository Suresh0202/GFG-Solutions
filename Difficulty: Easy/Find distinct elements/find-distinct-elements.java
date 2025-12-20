// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        // code here
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        return mp.size();
    }
}