/**
 * Author: ?
 * Data: 09/08/23
 * Description: 
 */

import java.util.Arrays;
import java.util.Scanner;

class inClass2dArr{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a row");
		int row = scan.nextInt();	

		System.out.println("Please enter a col");
		int col = scan.nextInt();

		//Create a two dimensional array
		int [][] countingNums1 = new int[row][col];
		System.out.println("Current numbers in countingNums1");
		for(int i = 0; i<countingNums1.length; i++){
			System.out.println(Arrays.toString(countingNums1[i]));
		}

		//Create a populated two dimensional array
		int[][] countingNums2 = {{1,2,3} , {4,5,6}, {7,8,9}};
		

		int x = countingNums2[1][2];

		System.out.println("The value at row 1 col 2 is: " + x);

		countingNums2[2][0] = 20;

		System.out.println("The value at row 2 col 0 is: " + countingNums2[2][0]);

		countingNums2[1][2] = 40;
		System.out.println("The value at row 1 col 2 is: " + countingNums2[1][2]);

		for(int i = 0; i < countingNums2.length; i++){
			for(int k = 0; k<countingNums2[i].length; k++){
				System.out.println(countingNums2[i][k]);
			}
		}

		Arrays.asList(countingNums2).stream().forEach(arr -> {
			System.out.println(Arrays.toString(arr));
		});

		// for(int i = 0; i < countingNums2.length; i++){
		// 	System.out.println(Arrays.toString(countingNums2[i]));
		// }

		scan.close();	
	}
}
