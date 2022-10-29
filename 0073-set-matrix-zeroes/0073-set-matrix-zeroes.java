class Solution {

    public void setZeroes(int[][] mat) {
        ArrayList<Pair> zeros = new ArrayList<Pair>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) zeros.add(new Pair(i, j));
            }
        }
        for (int i = 0; i < zeros.size(); i++) {
            Pair currentPair = zeros.get(i);
            fillZeros(mat, currentPair.i, currentPair.j);
        }
    }

    public void fillZeros(int[][] mat, int i, int j) {
        for (int y = 0; y < mat.length; y++) mat[y][j] = 0;
        for (int x = 0; x < mat[0].length; x++) mat[i][x] = 0;
    }
}

class Pair {
    int i;
    int j;

    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
