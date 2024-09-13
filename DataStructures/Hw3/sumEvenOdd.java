/**
 * Author: Isaac Watts
 * Date: 09/20/23
 * Description: Sum up the even and odd numbers. 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class sumEvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> setOfNums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        Boolean con = true;
        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            setOfNums.add(num);

            System.out.print("Do you want to enter another number (y/n): ");
            String confirm = sc.next().toLowerCase();

            if (confirm.charAt(0) == 'n') {
                con = false;
            }
        } while (con);

        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < setOfNums.size(); i++) {
            int number = setOfNums.get(i);
            if ((number & 1) == 1)
                sumOfOdd += number;
            else
                sumOfEven += number;
        }

        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of odd numbers: " + sumOfOdd);
        sc.close();
    }
}
