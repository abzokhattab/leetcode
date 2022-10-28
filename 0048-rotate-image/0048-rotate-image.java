class Solution {

    //1 0 0 1
    //     public void rotate(int[][] mat) {
    //         int n = mat.length;
    //         int m = mat[0].length;
    //         int [] [ ] r = new int [n][m];

    //         for(int i= 0; i<n;i++){
    //             for(int j=0;j<m;j++){
    //                 r[i][j]=mat[n-1-j][i];
    //             }
    //         System.out.println(Arrays.toString(r[i]));
    //          }

    //     }

    // 0 2 to 2 3  j,n-1-i
    // 2 3 to 3 1  j,n-i-i
    // 2 0 to 0 1 j,n-1-i

    //  1 1 == 1 2   1 2
    public void rotate(int[][] mat) {
        int N = mat.length;
        int n = mat.length - 1;
        for (int y = 0; y < N / 2; y++) {
            // Consider elements in group
            // of 4 in current square
            for (int x = y; x < N - y -1; x++) {
                
                // y=  0 x = 2; 
                int temp = mat[y][x];
               // y=0,x=2 ---> y= 3-2= 1 
                mat[y][x] = mat[n - x][y];

                 mat[n - x][y] = mat[n - y][n - x];
                 mat[n - y][n - x] = mat[x][n - y];
                mat[x][n -y] = temp;
            }
        }
    }
}
