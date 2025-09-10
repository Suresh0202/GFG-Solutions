class Solution {
    public String largestSwap(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        
        // Step 1: Store the last index of each digit
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[ch[i] - '0'] = i;
        }
        
        // Step 2: Traverse from left, try to swap with a bigger digit later
        for (int i = 0; i < n; i++) {
            for (int d = 9; d > ch[i] - '0'; d--) {
                if (last[d] > i) { // bigger digit exists later
                    // Swap
                    char temp = ch[i];
                    ch[i] = ch[last[d]];
                    ch[last[d]] = temp;
                    return new String(ch);
                }
            }
        }
        
        // Already largest
        return s;
    }
}
