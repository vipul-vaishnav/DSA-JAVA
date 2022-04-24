import java.util.Arrays;

public class LC832 {
    // 832. Flipping an Image
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] newArr = flipAndInvertImage(image);
        int[][] newArr2 = flipImage(image);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(Arrays.toString(newArr[i]));
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(Arrays.toString(newArr2[i]));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] output = new int[image.length][];
        for (int i = 0; i < image.length; i++) {
            output[i] = reverseArray(image[i]);
        }
        for (int i = 0; i < output.length; i++) {
            negateArr(output[i]);
        }
        return output;
    }

    public static int[] reverseArray(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - i - 1];
        }
        return revArr;
    }

    public static void negateArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
    }

    // SOLUTION 2
    public static int[][] flipImage(int[][] image) {
        int[][] output = new int[image.length][];

        for (int i = 0; i < image.length; i++) {
            output[i] = reverseAndInvert(image[i]);
        }

        return output;
    }

    public static int[] reverseAndInvert(int[] arr) {
        int[] output = new int[arr.length];

        for (int i = 0; i < output.length; i++) {
            output[i] = arr[arr.length - (i + 1)] == 1 ? 0 : 1;
        }

        return output;
    }
}
