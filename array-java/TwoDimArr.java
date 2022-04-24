import java.util.Arrays;

public class TwoDimArr {
    public static void main(String[] args) {
        // int[][] arr = new int[5][]; Declaration

        int[][] arr = {{1,2,3,4}, {21, 22, 23, 24, 25}, {31, 32, 33, 34}}; //Initialisation
        int[][] arr2 = { {1,2,3,4},     // row 1 (0)
                         {21, 22, 23, 24, 25}, // row 2 (1)
                         {31, 32, 33, 34} // row 3 (2)
                       }; //Initialisation

        // Printing of 2D array
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
        }

        // Printing of 2D array
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }
    }
}
