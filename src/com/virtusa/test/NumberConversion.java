package com.virtusa.test;

public class NumberConversion {
/*	public static void main(String[] args) {
		Utility util = new Utility();
		int input = 56945781;

		String result = "";

		int hundredCount = util.oneConverter(input);
		int thousandCount = util.hundredConverter(input);
		int milonCount = util.millionConverter(input);

		if (milonCount > 0) {
			result = util.hundredDigitConverter(String.valueOf(milonCount).toCharArray()) + " millio ";

		}
		if (thousandCount > 0) {
			result += util.hundredDigitConverter(String.valueOf(thousandCount).toCharArray()) + " Thousand ";
		}

		if (hundredCount > 0) {
			result += util.hundredDigitConverter(String.valueOf(hundredCount).toCharArray());
		}

		System.out.println(result);

	}*/
	public String converter(int input) {
		Utility util = new Utility();

		String result = "";

		int hundredCount = util.oneConverter(input);
		int thousandCount = util.hundredConverter(input);
		int milonCount = util.millionConverter(input);

		if (milonCount > 0) {
			result = util.hundredDigitConverter(String.valueOf(milonCount).toCharArray()) + " millio ";

		}
		if (thousandCount > 0) {
			result += util.hundredDigitConverter(String.valueOf(thousandCount).toCharArray()) + " Thousand ";
		}

		if (hundredCount > 0) {
			result += util.hundredDigitConverter(String.valueOf(hundredCount).toCharArray());
		}
		return result;
	}

}
