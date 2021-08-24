package java8_exercise_book.exercise_5;

import java.util.Arrays;
import java.util.Scanner;

public class Iteration {

	public static void main(String[] args) {

//		method1To10();
//		method100to999();
//		methodOneToTen();
		convertToString();
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
//-----------------------------------------------------------------------------------------------------------------------------
	// Has a method that prints out the numbers between 1 and 100 in words

	// array to store the word equivalent of number
	public static String[] s = new String[5];

	// grow array by increment of 5
	public static void grow(String[] str) {
		String[] newS = new String[str.length + 5];
		System.arraycopy(str, 0, newS, 0, str.length);
		s = newS.clone();
	}

	public static void convertToString() {
		int count = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter an integer (4 digits max)");
			int value = input.nextInt();
			if (value > 0) {
				Numbers n = new Numbers(value);
				//growing array as needed
				if (count >= s.length) {
					grow(s);
				}
				s[count] = n.toString();
				count++;
			}
			else break;
		}while (true);
		System.out.println();
		
		//print the array to screen
		for(int i = 0; s[i] != null && i < s.length; i++) {
			System.out.println(s[i]);
		}
		}
	
}
