
import java.util.Arrays;

public class LC867 {
    // 867.Transpose Matrix

    public static void main(String[] args) {
        System.out.println("Transpose of Matrix: ");
        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        // Output: [[1,4,7],[2,5,8],[3,6,9]]
        int[][] arr = transpose(matrix);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}
