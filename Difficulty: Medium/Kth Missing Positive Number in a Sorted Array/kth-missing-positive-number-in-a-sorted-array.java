

class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
      int miss = 0;
        int curr = 1;
        int i = 0;
        
        while (true) {
            if (i >= arr.length || curr != arr[i]) {
                miss++;
                if (miss == k) {
                    return curr;
                }
            } else {
                i++;
            }
            curr++;
        }
   
    }
}