package java8_exercise_book.exercise_5;

import java.util.Arrays;

public class Iteration {

	public static void main(String[] args) {

//		method1To10();
//		method100to999();
		methodOneToTen();
	}

	// Has a method that prints out the numbers between 1 and 10
	public static void method1To10() {

		// print the result
		System.out.println("Output is : ");

		// loop to print 1 to 10.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	// Has a method that prints out the numbers between 100 and 999
	public static void method100to999() {

		for (int i = 100; i < 1000; i++) {
			System.out.println("Loop Value = " + i);
		}
	}

	// Has a method that prints out the numbers between 1 and 10 in words.
	public static void methodOneToTen() {
		String[] array = new String[] { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
		System.out.println(Arrays.toString(array));
	}
	

	
}
