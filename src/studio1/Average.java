package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner first = new Scanner(System.in);
		System.out.print("Enter your first number ");
		int firstInteger = first.nextInt();
		Scanner second = new Scanner(System.in);
		System.out.print("Enter your second number ");
		int secondInteger = second.nextInt();
		double average = (firstInteger + secondInteger)/ 2.0;
		System.out.print("The average is "+ average);

	}

}
