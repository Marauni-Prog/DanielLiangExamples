package Examples;

import java.util.Scanner;

public class BMI_Converter {
	public static void main(String[]args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Height in cms");
			double height=scanner.nextDouble()*0.01;
			System.out.println("Enter weight in Kgs");
			double weight=scanner.nextDouble();
			System.out.println("Your BMI is "+findBmi(height,weight));
			commentBmi(findBmi(height,weight));
		}
		}
public static double findBmi(double height, double weight) {
	double BMI=weight/(height*height);
	return BMI;
}
public static void commentBmi(double BMI) {
	if(BMI<18.5) {
		System.out.println("UNDERWEIGHT");
	}else if(BMI<25) {
		System.out.println("NORMAL");
	}else if(BMI<30){
		System.out.println("OVERWEIGHT");
	}else 
		System.out.println("OBESE");
}
}
