// User function Template for Java
import java.util.*;

class Solution {
    // 8 directions: right, left, down, up, diag-right-down, diag-left-up, diag-left-down, diag-right-up
    int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
    int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};

    // check if word exists starting from (row,col) in direction (dx,dy)
    private boolean searchFrom(int row, int col, char[][] grid, String word, int dirX, int dirY) {
        int n = grid.length, m = grid[0].length;

        for (int k = 0; k < word.length(); k++) {
            int nr = row + k * dirX;
            int nc = col + k * dirY;

            if (nr < 0 || nc < 0 || nr >= n || nc >= m || grid[nr][nc] != word.charAt(k)) {
                return false;
            }
        }
        return true;
    }

    public int[][] searchWord(char[][] grid, String word) {
        int n = grid.length, m = grid[0].length;
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    // try all 8 directions
                    for (int d = 0; d < 8; d++) {
                        if (searchFrom(i, j, grid, word, dx[d], dy[d])) {
                            ans.add(new int[]{i, j});
                            break; // avoid duplicate insertion
                        }
                    }
                }
            }
        }

        // convert List<int[]> → int[][]
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i)[0];
            res[i][1] = ans.get(i)[1];
        }
        return res;
    }
}
