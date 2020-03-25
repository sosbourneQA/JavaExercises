package com.qa.main;

public class Calculator {

	public void answer(double num1, double num2, boolean answer) {

		if (num1 % 2 == 0 || num2 % 2 == 0) {
			System.out.println(0);
		} else if (answer == true) {
			System.out.println(num1 + num2);
		} else {
			System.out.println(num1 * num2);
		}

	};

}
