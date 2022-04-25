public class LC1252 {
    // 1252. Cells with Odd Values in a Matrix
    public static void main(String[] args) {
        // int m = 2;
        // int n = 3;
        // int[][] indices = { { 0, 1 }, { 1, 1 } };
        // System.out.println(oddCells(m, n, indices));

        int m = 2;
        int n = 2;
        int[][] indices = { { 1, 1 }, { 0, 0 } };
        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count = 0;

        for (int index = 0; index < indices.length; index++) {
            for (int i = 0; i < indices[index].length; i++) {
                if (i == 0) {
                    for (int j = 0; j < matrix[indices[index][i]].length; j++) {
                        matrix[indices[index][i]][j]++;
                    }
                } else {
                    for (int j = 0; j < matrix.length; j++) {
                        for (int j2 = 0; j2 < matrix[j].length; j2++) {
                            if (j2 == indices[index][i]) {
                                matrix[j][j2]++;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
