/**
 * Author: Isaac Watts
 * Data: 08/31/23
 * Description: Made an IsEven function to determine even or odd integers. 
 */
import java.util.Scanner;

public class EvenOrOdd{
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		if(!sc.hasNextInt()){
			System.out.println("Not a valid input, must be an integer");
			sc.close();
			return;
		}
		num = sc.nextInt(); 

		if(isEven(num)){
			System.out.printf("The number %d is even.%n", num);
			
		}
		else{
			System.out.printf("The number %d is odd.%n", num);
			
		}

		sc.close();
	}
	public static boolean isEven(int num){
		return (num & 1) == 0;
	}
}
