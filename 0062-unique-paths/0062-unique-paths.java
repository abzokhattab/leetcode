class Solution {

    // down or right

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == m - 1 || j == n - 1) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = m-2; i>=0; i--) {
            for (int j =n-2; j >=0; j--) {
                dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
            }
        }
        return dp[0][0];
    }
    //     static int[][] memo;

    //     public int uniquePaths(int m, int n) {
    //         memo = new int[m][n];

    //         for (int[] row : memo) Arrays.fill(row, -1);

    //         return uniquePathsHelper(m, n, 0, 0);
    //     }

    //     public int uniquePathsHelper(int m, int n, int i, int j) {
    //         if (i < 0 || j < 0 || i >= m || j >= n) return 0;

    //         if (memo[i][j] != -1) return memo[i][j];

    //         int moveDown = uniquePathsHelper(m, n, i + 1, j);
    //         int rightDown = uniquePathsHelper(m, n, i, j + 1);

    //         int result = (i == m - 1 && j == n - 1) ? 1 : moveDown + rightDown;
    //         memo[i][j] = result;
    //         return result;
    //     }
}
