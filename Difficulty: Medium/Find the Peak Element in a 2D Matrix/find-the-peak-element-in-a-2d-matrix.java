class Solution {

    public ArrayList<Integer> findPeakGrid(int[][] mat) {

        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int curr = mat[i][j];

                int up    = Integer.MIN_VALUE;
                int down  =Integer.MIN_VALUE;
                int left  = Integer.MIN_VALUE;
                int right = Integer.MIN_VALUE;

                if (i - 1 >= 0)     up = mat[i - 1][j];
                if (i + 1 < n)      down = mat[i + 1][j];
                if (j - 1 >= 0)     left = mat[i][j - 1];
                if (j + 1 < m)      right = mat[i][j + 1];

                if (curr >= up && curr >= down &&
                    curr >= left && curr >= right) {

                    ans.add(i);
                    ans.add(j);
                    return ans;   
                }
            }
        }
        return ans;
    }
}
