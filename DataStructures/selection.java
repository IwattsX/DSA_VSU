package DataStructures;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 3, 9, 4, 1};
        System.out.println(Arrays.toString(arr));
    
        for(int i = 0; i<arr.length; i++){
            int min = arr[i];
            int curr = arr[i];
            for(int j = i+1; j<arr.length; j++){
                curr = arr[j];
                if(curr > min){
                    min = curr;
                }
            }
        }

        System.out.println("Arrays sorted: " + Arrays.toString(arr));
    }
}
