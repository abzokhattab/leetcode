class Solution {
    public static boolean[][] visited;

    public int numIslands(char[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(grid, i, j);
                    res++;
                }
            }
        }

        return res;
    }

    public static void dfs(char[][] mat, int i, int j) {
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length) return;
        if (mat[i][j] == '1'&&!visited[i][j] ) {
            visited[i][j] = true;
            dfs(mat, i + 1, j);
            dfs(mat, i, j + 1);
            dfs(mat, i - 1, j);
            dfs(mat, i, j - 1);
        }
    }
}
