package java8_exercise_book.exercise_4;

import java.util.Scanner;




public class Calculator {
	//Combines the 4 methods from earlier into one method that takes 3 parameters, 
	//the third parameter represents which arithmetic operation you need to perform.
	public double addition(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	
	public double divide(double num1, double num2, double num3) throws DivideByZeroException {
		if(num3 == 0) {
			throw new DivideByZeroException("Can't Divide by zero!");
		}
		return num1 / num2 / num3;
	}
	
	public double multiply(double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}
	
	public double subtract(double num1, double num2, double num3) {
		return num1 - num2 - num3;
	}

	public int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which method would you like to use?");
		System.out.println("1. Addition");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("0. Quit");

		 return scan.nextInt();
	}
}
