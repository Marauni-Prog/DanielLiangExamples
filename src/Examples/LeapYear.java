package Examples;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[]args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter Year");
			int year=scan.nextInt();
			if(findLeapYear(year)) {
				System.out.println(year+" is a leap Year");
			}else 
				System.out.println(year+ " is not a leap year");
		}
	}
	public static boolean findLeapYear(int year) {
		boolean leap=false;
		if((year%4==0&&year%100!=0)||(year%400==0)){
			leap=true;
		}
		return leap;
	}

}
