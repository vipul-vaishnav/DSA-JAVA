public class LC1572 {
    // 1572. Matrix Diagonal Sum
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 } };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        if (mat.length % 2 == 0) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (i == j) {
                        sum += mat[i][j];
                    }
                }
            }
        } else {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (i == j) {
                        sum += mat[i][j];
                    }
                }
            }
        }
        return sum;
    }
}
