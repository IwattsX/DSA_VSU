/**
 * Author: Isaac Watts
 * Date: 09/20/23
 * Description: TwoD array sum
 *
 * The two-dimensional array is: [0,7,3]
 *                               [4,5,0]      
 *                               [1,8,6] 
 * The sum of the two-dimensional array is: 3.777777778 
 */
import java.util.Arrays;

public class Average2dArray {
    public static void main(String[] args) {
        int[][] arr = {{0,7,3},
                       {4,5,0},      
                       {1,8,6}};
        System.out.print("The two dimensional array is: ");
        printArray(arr);
        System.out.printf("The sum of the two-dimensional array is: %.9f%n", mean(arr));
    }

    public static double mean(int[][] arr) {
        double size = (double) arr.length * arr[0].length;
        double sum = (double) sum(arr);
        double res = sum / size;
        return res;
    }

    public static int sum(int[][] arr) {
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
