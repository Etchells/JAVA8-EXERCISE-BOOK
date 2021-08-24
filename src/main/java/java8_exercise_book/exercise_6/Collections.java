package java8_exercise_book.exercise_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		oneToOneHundredArray();
		
	}
	

//method that iterates through the numbers 1 to 100 and adds them into an Array
	public static void oneToOneHundredArray() {
		int[] numbers = new int[101]; 
		for(int i = 1; i < numbers.length; i++){
		  numbers[i] = i;
//		  System.out.println(numbers[i]);
		}
		 System.out.println(Arrays.toString(numbers));
	}
	
	//method that iterates through the number 100 to 999 and adds them into a List
	public static void something() {
	
		}

	

	
}
