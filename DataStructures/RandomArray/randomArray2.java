
/**
 * Author: Isaac Watts
 * Date: 08/30/2023
 * Description: Putting random numbers into an array in java
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class randomArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an array size: ");
        int arraySize = sc.nextInt();

        System.out.println("Please enter a bound: ");
        int bound = sc.nextInt();

        int arr[] = new int[arraySize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomArray2.myRandom(bound);
        }

        System.out.println("-------------------------------");
        System.out.printf("The bound is %d%n", bound);

        System.out.printf("Size of the array = %d%n", arr.length);

        System.out.println("The array is " + Arrays.toString(arr));

        sc.close();
    }

    public static int myRandom(int bounds) {
        Random rand = new Random();
        return rand.nextInt(bounds);
    }
}
