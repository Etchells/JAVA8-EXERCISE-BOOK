package java8_exercise_book.exercise_5;

public class Numbers {

	private final String[] SINGLE_DIGIT_WORDS;
	private final String[] TEEN_DIGIT_WORDS;
	private final String[] TEN_DIGIT_WORDS;
	private int value, one, ten, hundred, thousand;

//initialising value and arrays
	public Numbers(int n) {
		this.value = n;
		SINGLE_DIGIT_WORDS = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };
		TEEN_DIGIT_WORDS = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
				"seventeen", "eighteen", "nineteen" };
		TEN_DIGIT_WORDS = new String[] { "twenty", "therty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
	}

//return number of single digit
	private int getOnes() { // the last digit
		return value % 10;
	}

//return number of tens
	private int getTens() {// the last 2 digits
		ten = value % 100;
		ten /= 10;
		return ten;
	}

//return number of hundreds
	private int getHundreds() {
		hundred = value % 1000;
		hundred /= 100;
		return hundred;
	}

//return number of thousands
	private int getThousands() {
		thousand = value % 10000;
		thousand /= 1000;
		return thousand;
	}

//return string of single digit	
	private String digitsToString(int one) {
		return SINGLE_DIGIT_WORDS[one];
	}

//return string of tens and teens digit	
	private String tensAndOnesToString(int ten, int one) {
		if (ten == 1) {
			return TEEN_DIGIT_WORDS[one];
		}
		return TEN_DIGIT_WORDS[ten - 2];
	}

// return string of hundreds digit
	private String hundredToString(int hundred) {
		if (hundred == 1) {
			return digitsToString(hundred) + " hundred";
		}
		return digitsToString(hundred) + " hundred";
	}

//return string of thousands digit
	private String thousandToString(int thousand) {
		if (thousand == 1) {
			return digitsToString(thousand) + " thousand";
		}
		return digitsToString(thousand) + " thousand";
	}

//return string of whole number
	@Override
	public String toString() {
		int d1 = getThousands();
		int d2 = getHundreds();
		int d3 = getTens();
		int d4 = getOnes();

		String strOut = "";
		boolean isTeen = false;

		if (d1 != 0) {
			strOut = thousandToString(thousand);
		}
		if (d2 != 0) {
			if (strOut.equals("")) {
				strOut = hundredToString(hundred);
			} else {
				strOut += hundredToString(hundred);
			}
		}

		if (d3 != 0) {
			if (strOut.equals("")) {
				if (d3 == 1) {
					strOut = tensAndOnesToString(ten, one);
					isTeen = true;
				} else
					strOut = tensAndOnesToString(ten, one);
			} else if (!strOut.equals("")) {
				strOut = strOut + " and " + tensAndOnesToString(ten, one);
			}
			else {
				strOut = strOut + " and " + tensAndOnesToString(ten, one);
			}
		}

		if (d4 != 0 && isTeen == false) {
			if (strOut.equals("")) {
				strOut = digitsToString(one);
			} else if (!strOut.equals("") && d3 == 0) {
				strOut = strOut + " and " + digitsToString(one);
			} else {
				strOut = strOut + " " + digitsToString(one);
			}
		}
		return strOut.substring(0, 1).toUpperCase() + strOut.substring(1);

	}
}