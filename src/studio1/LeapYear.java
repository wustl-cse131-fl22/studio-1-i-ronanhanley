package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = scan.nextInt();
		boolean result;
		if(year%400==0) result = true;
		else if(year%4==0 && year%100!=0) result = true;
		else result = false;
		System.out.print("The year " + year + " is a leap year: " + result);

	}

}
