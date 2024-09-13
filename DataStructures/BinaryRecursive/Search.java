// package DataStructures.BinaryRecursive;
/**
 * Author: Isaac Watts
 * Date: 10/29/23
 * Description: binarySearch done recursively instead of iteratively
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Search{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        
        for(int i = 0; i<arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
        System.out.println("The unsorted array is: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.print("Please enter a value to be found: ");
        int value = sc.nextInt();
        sc.close();

        System.out.printf("The value to be searched for is %d.%n", value);

        int idx = binarySearch(arr, 0, arr.length, value);

        if(idx == -1){
            System.out.printf("The value, %d, is not found.%n", value);
            return;
        }

        System.out.printf("The value, %d, is present in the array and is located at index %d.%n", value, idx);
    
    }
    public static int binarySearch(int[] arr, int low, int high, int value){
        if(low > high || high < low){
            return -1;
        }
        int middle = low + (high - low) / 2;

        if(arr[middle] == value){
            return middle;
        }
        if(arr[middle] > value){
            return binarySearch(arr, low, middle-1, value);
        }

        return binarySearch(arr, middle + 1, high, value);

    }

}
