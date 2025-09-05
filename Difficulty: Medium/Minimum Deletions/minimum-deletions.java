class Solution {
    static int minDeletions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // substrings of length 1 are already palindromes, so dp[i][i] = 0

        // gap = substring length - 1
        for (int gap = 1; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; i++, j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];  // no deletion needed
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]); // delete one side
                }
            }
        }

        return dp[0][n - 1]; // whole string result
    }
}
