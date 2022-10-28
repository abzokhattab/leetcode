class Solution {
    // down or right
    static int[][] memo;

    public int uniquePaths(int m, int n) {
        memo = new int[m][n];

        for (int[] row : memo) Arrays.fill(row, -1);

        return uniquePathsHelper(m, n, 0, 0);
    }

    public int uniquePathsHelper(int m, int n, int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n) return 0;

        if (memo[i][j] != -1) return memo[i][j];

        int moveDown = uniquePathsHelper(m, n, i + 1, j);
        int rightDown = uniquePathsHelper(m, n, i, j + 1);

        int result = (i == m - 1 && j == n - 1) ? 1 : moveDown + rightDown;
        memo[i][j] = result;
        return result;
    }
}
