/**
 * Author: Isaac Watts
 * Date: 09/20/23
 * Description: Get the max, min from an array.
 * 
 * The array is: [1, 2, 3, 4, 5] 
 * The maximum value is: 5 
 * The minimum value is: 1 
 */
import java.util.Arrays;
import java.util.Collections;

public class maxMin {
    public static void main(String[] args) {
    Integer[] arr = {1,2,3,4,5};

    int max = Collections.max(Arrays.asList(arr));
    int min = Collections.min(Arrays.asList(arr));

    System.out.println("The array is: " + Arrays.toString(arr));
    System.out.println("The maximum value is: " + max);
    System.out.println("The minimum value is: " + min);
    }

    
}
