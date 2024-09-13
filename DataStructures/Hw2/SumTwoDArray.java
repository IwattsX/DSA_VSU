/**
 * Author: Isaac Watts
 * Date: 09/12/2023
 * Description: Write a program that calculates sums of 2d arrays and makes random 2d arrays.
 * Inputs: bounds, row, col
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class SumTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bounds;

        try {
            System.out.println("Please enter the bounds of the array");
            if (!sc.hasNextInt())
                throw new IllegalArgumentException("Input must be an integer");

            bounds = sc.nextInt();
            System.out.println("Please enter the number of rows");
            if (!sc.hasNextInt())
                throw new IllegalArgumentException("Input must be an integer");
            int rows = sc.nextInt();

            System.out.println("Please enter the number of columns");
            if (!sc.hasNextInt())
                throw new IllegalArgumentException("Input must be an integer");
            int columns = sc.nextInt();

            if (bounds <= 0 || rows <= 0 || columns <= 0)
                throw new IllegalArgumentException("Inputs must be positive");

            int[][] rand2dArr = createTwoDArray(bounds, rows, columns);

            System.out.print("The two dimensional array is: ");
            printArray(rand2dArr);
            System.out.println("The sum of the two dimensional array is: " + sum(rand2dArr));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        } finally {
            sc.close();
        }
    }

    public static int[][] createTwoDArray(int bound, int n, int m) {
        int[][] res = new int[n][m];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = randomNumber(bound);
            }
        }
        return res;
    }

    public static int randomNumber(int bound) {
        Random rand = new Random();
        return rand.nextInt(bound);
    }

    public static int sum(int[][] arr) {
        /**calculates the sum of the 2d array 
         * By making it a stream object and using a IntStream
         * and in-build .sum method from the .flatMapToInt() 
        */
        return Arrays.asList(arr)
            .stream()
            .flatMapToInt(Arrays::stream)
            .sum();
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) // format spaces
                System.out.printf("%30s", " ");
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}