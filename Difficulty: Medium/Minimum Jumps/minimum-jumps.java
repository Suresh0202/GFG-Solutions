class Solution {
    static int minJumps(int[] arr) {
         int n = arr.length;
        if (n <= 1) return 0;        // already at end
        if (arr[0] == 0) return -1;  // can't move anywhere

        int maxReach = arr[0];  // farthest index reachable
        int steps = arr[0];     // steps we can still take in current jump
        int jumps = 1;          // we start with one jump

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps; // reached end

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            if (steps == 0) {
                jumps++;
                if (i >= maxReach) return -1; // can't progress further
                steps = maxReach - i;
            }
        }
        return -1;
    }
}