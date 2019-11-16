package com.virtusa.test;

public class test {

	public static void main(String[] args) {
		int givenInputTest = 56945781;
		int maxLenghthtest = 999999999;
		int threeDigitTest = 123;
		int twoDigitTest = 25;
		int oneDigitTest = 1;
		
		NumberConversion numConvertor = new NumberConversion();
		
		System.out.println(givenInputTest +" - " +numConvertor.converter(givenInputTest));
		System.out.println(maxLenghthtest +" - " +numConvertor.converter(maxLenghthtest));
		System.out.println(threeDigitTest +" - " +numConvertor.converter(threeDigitTest));
		System.out.println(twoDigitTest +" - " +numConvertor.converter(twoDigitTest));
		System.out.println(oneDigitTest +" - " +numConvertor.converter(oneDigitTest));
	}

}
