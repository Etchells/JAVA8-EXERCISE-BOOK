package java8_exercise_book.exercise_1;

public class HelloWorld {

	public static void main(String[] args) {

	// Outputs “HelloWorld” to the console.
		System.out.println("HelloWorld");

	// Return “HelloWorld” as a String.
		String text = "HelloWorld";
		System.out.println(text);

		text("I'am a string called from the method below");
	}

	// Has a method that takes a String parameter and outputs this to the console.
	public static void text(String string) {
		System.out.println(string);
	}
}
