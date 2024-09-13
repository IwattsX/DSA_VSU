/**
 * Author: Isaac Watts
 * Date: 09/20/23
 * Description: 1-10
 * An example of the program input and output is shown below:  
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 
 */

import java.util.Arrays;

public class ten {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = (i+1);
        }
        String res = Arrays.toString(arr).replace("[", "");
        res = res.replace("]", "");
        System.out.println(res);

    }
}
