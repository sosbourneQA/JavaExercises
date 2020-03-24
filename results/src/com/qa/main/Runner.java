package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float biology = 120;
		float chemistry = 120;
		float physics = 30;

		ExamCalculator example = new ExamCalculator();

		example.displayResults(biology, chemistry, physics);
		example.displayPercentage(biology, chemistry, physics);
	}

}
