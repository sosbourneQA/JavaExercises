package com.qa.main;

public class CalcRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 5;
		double num2 = 6;
		boolean answer = true;
		int A = 1;

		Calculator calc = new Calculator();

		calc.answer(num1, num2, answer);

		Q2Appendix attempt = new Q2Appendix();

		System.out.println(attempt.tree(A));

	}

}
