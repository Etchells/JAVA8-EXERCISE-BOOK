package java8_exercise_book.exercise_6;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections {
	
	static ArrayList<Integer> myList = new ArrayList<Integer>();

	public static void main(String[] args) {
		addToArray();
		AddToList();
		multiplyListBy10();
	}

	//method that iterates through the numbers 1 to 100 and adds them into an Array
	public static void addToArray() {
		int[] numbers = new int[100];
		for (int i = 1; i < 100; i++) {
			numbers[i] = i;
//		  System.out.println(numbers[i]);
		}
		System.out.println(Arrays.toString(numbers));
	}

	// method that iterates through the number 100 to 999 and adds them into a List
	public static void AddToList() {
		for (int i = 100; i < 1000; i++) {
			myList.add(i);
		}
		System.out.println(myList);

	}
	//Have a method that iterates through your List from above and multiply each number by 10.
	public static void multiplyListBy10() {
		for (int i = 0; i < myList.size(); i++)
		System.out.println(myList.get(i)*10);
	}
}
