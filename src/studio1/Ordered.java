package studio1;

import java.util.Scanner;

public class Ordered {
/*Define a boolean variable isOrdered whose value is true if
 *  the three values are either in strictly ascending
 *   order (x < y < z) or in strictly descending order (x > y > z), 
 *   and false otherwise. Print out the variable isOrdered using System.out.println(isOrdered).
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean isOrdered;
		if(x < y && y < z) {
			isOrdered = true;
		} else if(x>y && y>z) {
			isOrdered =true;
		} else {
			isOrdered = false;
		}
		System.out.print(isOrdered);
	}
		
		
		
		

	}


