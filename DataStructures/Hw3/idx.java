/**
 * Author: Isaac Watts
 * Date: 09/20/23
 * Description: Find a index of a number in an array
 * 
 * An example of the program input and output is shown below:  
 * The array is: [1, 2, 3, 4, 5] 
 * Please enter a value to find: 5 
 * The number 5 is at index: 4 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class idx {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //has to use the Integer wrapper for this to work.
        Integer[] arr = new Integer[]{1,2,3,4,5};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));

        System.out.println("The array is " + list1);
        System.out.print("Please enter a value to find: ");
        int value = sc.nextInt();
        int idx = list1.indexOf(value);
        System.out.printf("The number %d is at index: %d%n", value, idx);
        sc.close();
    }
}
