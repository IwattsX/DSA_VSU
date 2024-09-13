import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Author: Isaac Watts
 * Date: 11/08/23
 * Description: making a bunch of random arrays and using sorting algorithms for them
 */

public class mySorts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();
        System.out.println("The size of each array is " + size);

        System.out.print("Enter a bound: ");
        int bound = sc.nextInt();
        sc.close();

        System.out.println("The bound is " + bound);
        
        int[] arr1 = createRandomArray(size, bound);
        int[] arr2 = createRandomArray(size, bound);
        int[] arr3 = createRandomArray(size, bound);

        System.out.println("The first array is " + Arrays.toString(arr1));
        bubbleSort(arr1);
        System.out.println("The sorted array using bubble sort is " + Arrays.toString(arr1));


        System.out.println("The second array is " + Arrays.toString(arr2));
        selectionSort(arr2);
        System.out.println("The sorted array using selection sort is " + Arrays.toString(arr2));


        System.out.println("The third array is " + Arrays.toString(arr3));
        mergeSort(arr3);
        System.out.println("The sorted array using merge sort is " + Arrays.toString(arr3));
    }

    /**createRandomArray: This method should accept size, generate a random array, and return the array.  */
    public static int[] createRandomArray(int size, int bounds){
        int[] arr = new int[size];
        Random rand = new Random();
        for(int i = 0; i<arr.length; i++){
            arr[i] = rand.nextInt(bounds);
        }
        return arr;
    }
    
    public static void bubbleSort(int[] arr){
        for(int i = 0; i<arr.length - 1; i++){
            for(int j = 0; j<arr.length - i - 1; j++){ 
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[min]) min = j;
            }
            swap(arr, min, i);
        }
    }
    public static void mergeSort(int[] arr){
        if (arr.length < 2){
            return;
        }

        int middle = arr.length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, middle);
        int[] rightArr = Arrays.copyOfRange(arr, middle, arr.length);

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr, middle, arr.length - middle);

    }
    public static void merge(int[] arr, int[] left, int[] right, int lp, int rp){
        int i = 0, j = 0, k = 0;
        while (i < lp && j < rp) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < lp) {
            arr[k++] = left[i++];
        }
        while (j < rp) {
            arr[k++] = right[j++];
        }

    }
    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx2];
        arr[idx2] = arr[idx1];
        arr[idx1] = temp;
    }
}
