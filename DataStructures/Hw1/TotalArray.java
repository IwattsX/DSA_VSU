/**
 * Author: Isaac Watts
 * Date: 08/31/2023
 * Description: Using a random array w/ summing the elements
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class TotalArray{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter an array size: ");

			if(!sc.hasNextInt()) throw new IllegalArgumentException("Inputs must be an integer value");	
			int arraySize = sc.nextInt();

			System.out.print("Enter a bound: ");

			if(!sc.hasNextInt()) throw new IllegalArgumentException("Inputs must be an integer value");	
			int bounds = sc.nextInt();

			if(arraySize <= 0 || bounds <= 0) throw new IllegalArgumentException("Inputs can't be negative or 0");				
			
			int[] randArr = createRandomArray(arraySize, bounds);

			System.out.println("The random array is " + Arrays.toString(randArr));

			System.out.printf("The sum of random array is %d%n", sumArray(randArr));
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
    }

    public static int[] createRandomArray(int size, int bound){
	Random rand = new Random();
    	int[] randArray = new int[size];
	
	for(int i = 0; i<randArray.length; i++){
		randArray[i] = rand.nextInt(bound);
	}
	
	return randArray;
    }

    public static int sumArray(int[] arr){
	int total = 0;

    	for(int i = 0; i<arr.length; i++){
		total += arr[i];
	}
	return total;
    }

}
