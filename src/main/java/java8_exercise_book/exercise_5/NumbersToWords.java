package java8_exercise_book.exercise_5;

public class NumbersToWords {
	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		// 0
			"",		 	// 1
			"Twenty", 	// 2
			"Thirty", 	// 3
			"Forty", 	// 4
			"Fifty", 	// 5
			"Sixty", 	// 6
			"Seventy",	// 7
			"Eighty", 	// 8
			"Ninety" 	// 9
	};
	public static final String[] others = {
			"hunderd",
			"thousand",
			"lakh"
	};

	public static String numbersToWords(String num) {
		
		String words = "";
		int n = Integer.parseInt(num);
		if(n < 100) {
			words = (n%10 == 0) ? tens[n/10] :  tens[n/10] +" "+units[n%10];
		}else if(n < 1000) {
			words = (n%100 == 0) ? (units[n/100] +" "+others[0]) : (units[n/100] +" "+others[0]+" ")+numbersToWords(String.valueOf(n%100));
		}else if(n < 10000) {
			words = (n%1000 == 0) ? (units[n/1000] +" "+others[1]) : (units[n/1000] +" "+others[1] +" ")+numbersToWords(String.valueOf(n%1000));
		}else if(n < 100000) {
			words = (n%1000 == 0) ? (numbersToWords(String.valueOf(n/1000)) +" "+others[1]) : (numbersToWords(String.valueOf(n/1000)) +" "+others[1]+" ")+numbersToWords(String.valueOf(n%1000));
		}else {
			words = (n%100000 == 0) ? (numbersToWords(String.valueOf(n/100000)) +" "+others[2]) : (numbersToWords(String.valueOf(n/100000)) +" "+others[2]+" ")+numbersToWords(String.valueOf(n%100000));
		}
		return words;
	}
	
	
	public static void main(String[] args) {
		System.out.println("---TENS------");
		System.out.println(numbersToWords("56"));
		System.out.println(numbersToWords("99"));
		
		
		System.out.println("\n----HUNDREDS----");
		System.out.println(numbersToWords("900"));
		System.out.println(numbersToWords("855"));
		System.out.println(numbersToWords("456"));

		System.out.println("\n---THOUSANDS---");
		System.out.println(numbersToWords("8000"));
		System.out.println(numbersToWords("2345"));
		System.out.println(numbersToWords("45000"));
		System.out.println(numbersToWords("32400"));
		System.out.println(numbersToWords("28645"));
		
		System.out.println(numbersToWords("1"));
		System.out.println(numbersToWords("2"));
		System.out.println(numbersToWords("3"));
		System.out.println(numbersToWords("4"));
		System.out.println(numbersToWords("5"));
		System.out.println(numbersToWords("6"));
		System.out.println(numbersToWords("7"));
		System.out.println(numbersToWords("8"));
		System.out.println(numbersToWords("9"));
		System.out.println(numbersToWords("10"));


		
		
	}

}

