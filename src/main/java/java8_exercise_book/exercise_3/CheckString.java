package java8_exercise_book.exercise_3;

public class CheckString {

	public static void main(String[] args) {

		methodOne();
		methodTwo();

	}

	// Has a method that when given a String, checks that it matches a hard-coded
	// String.
	public static void methodOne() {
		// Given String
		String firstString = "Glenn";
		// Hard-coded String

		System.out.print("firstString.equals(hardCode) : ");

		System.out.println(firstString.equals("Bob"));
	}

	// Has a method that when given 2 Strings, compares the Strings and checks if
	// they are equal.
	public static void methodTwo() {
		// Given Strings
		String secondString = "Cat";
		String thirdString = "Cat";

		// Compares the Strings and checks if they are equal
		System.out.print("secondString.equals(thirdString) : ");

		System.out.println(secondString.equals(thirdString));
	}

}
