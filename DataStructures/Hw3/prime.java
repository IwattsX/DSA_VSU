/**
 * Author: Isaac Watts
 * Date: 09/20/23
 * Description: Show is a number is prime or not 
 * An example of the program input and output is shown below:  
 * Please enter a number:  7 
 * The number 7 is a prime number. 
 */

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.printf("The number %d is a prime number.%n", num);
        }
        else{
            System.out.printf("The number %d is not a prime number.%n", num);
        }
        sc.close();
    }
    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
