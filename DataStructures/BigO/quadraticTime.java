package DataStructures.BigO;

import java.util.Arrays;

public class quadraticTime {
    public static void main(String[] args) {
        int[] arr = {-2, 6, -1, 9, 10, -20, 30};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        int temp;
        for(int i = 0; i<arr.length - 1; i++){
            for(int j = 0; j<arr.length - i - 1; j++){ 
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
