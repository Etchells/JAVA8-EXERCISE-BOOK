package java8_exercise_book.exercise_2;

public class Calculator {

	public static void main(String[] args) {

		System.out.println(add(10,20));
		System.out.println(subtract(10,20));
		System.out.println(divide(10,20));
		System.out.println(multiply(10,20));
	}
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}


	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}


	public static double divide(double num1, double num2) throws ArithmeticException {
		if (num2 == 0)
			throw new ArithmeticException("Division by zero");
		return num1 / num2;
	}


	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
}
