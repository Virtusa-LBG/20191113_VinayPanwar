package com.virtusa.test;

public class Utility {

	public String numConverter(char a) {
		String result = "";
		if (a == '1')
			result = "one";
		else if (a == '2')
			result = "two";
		else if (a == '3')
			result = "three";
		else if (a == '4')
			result = "four";
		else if (a == '5')
			result = "five";
		else if (a == '6')
			result = "six";
		else if (a == '7')
			result = "seven";
		else if (a == '8')
			result = "eight";
		else if (a == '9')
			result = "nine";
		else if (a == '0')
			result = "zero";

		return result;
	}

	public String numTenthConverter(String a) {
		String result = "";
		if (a.equals("two"))
			result = "twenty";
		else if (a.equals("three"))
			result = "thirty";
		else if (a.equals("four"))
			result = "fourty";
		else if (a.equals("five"))
			result = "fivty";
		else if (a.equals("six"))
			result = "sixty";
		else if (a.equals("seven"))
			result = "seventy";
		else if (a.equals("eight"))
			result = "eighty";
		else if (a.equals("nine"))
			result = "ninty";
		else if (a.equals("zero"))
			result = "";

		return result;
	}

	public int millionConverter(int num) {
		return num / 1000000;
	}

	public int hundredConverter(int num) {
		num = num % 1000000;
		return num / 1000;
	}

	public int oneConverter(int num) {
		return num % 1000;
	}

	public String hundredDigitConverter(char[] ch) {
		String result = "";
		for (int i = 0; i < ch.length; i++) {
			result += numConverter(ch[i]) + " ";

		}

		String[] last = result.split(" ");

		if (last.length == 3) {

			return numConverter(ch[0]) + " hundred and " + numTenthConverter(numConverter(ch[1])) + " "
					+ numConverter(ch[2]);
		} else if (last.length == 2) {
			return numTenthConverter(numConverter(ch[0])) + " " + numConverter(ch[1]);
		} else {
			return result;
		}

	}

}
