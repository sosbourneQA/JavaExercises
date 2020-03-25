package com.qa.main;

public class ExamCalculator {
	public void displayResults(float bio, float chem, float phys) {
		System.out.println("this is you biology mark: " + bio);
		System.out.println("this is you biology mark: " + chem);
		System.out.println("this is you biology mark: " + phys);
		System.out.println("this is your total: " + (bio + chem + phys));
	}

	public void displayPercentage(float bio, float chem, float phys) {
//		System.out.println("this is your overall percentage: " + (((bio + chem + phys) / 450)) * 100);
//		if ((bio + chem + phys) / 450 * 100 < 60) {
//			System.out.println("you fail");
//		} else if (bio / 150 * 100 < 60 || chem / 150 * 100 < 60 || phys / 150 * 100 < 60) {
//			System.out.println("you just fail");
//	} 
		if (bio / 150 * 100 < 60 && chem / 150 * 100 < 60 && phys / 150 * 100 < 60) {
			System.out.println("you fail all three subjects");
			// checks if they have failed all 3
		} else if (bio / 150 * 100 > 60 && chem / 150 * 100 > 60 && phys / 150 * 100 > 60) {
			System.out.println("you passed all three subjects!");
			// checks if they passed all 3
		} else if ((bio / 150 * 100 < 60 && chem / 150 * 100 < 60) || (bio / 150 * 100 < 60 && phys / 150 * 100 < 60)
				|| (phys / 150 * 100 < 60 && chem / 150 * 100 < 60)) {
			System.out.println("you failed two subjects!");
			// checks if they failed 2
		} else {
			System.out.println("you failed one subject!");
			// default is that they failed 1
		}
		;

	}

}
// if they fail one module 
// if they fail 2 modules 
// phy && bio || chem && phy || chem && bio
//if they fail 3 modules 

//3 	Expand the previous example so that even if the person
//gets higher than 60% overall, if they fail 1 or more of the 
//exams (pass grade of 60% for each exam) they still fail overall.
//
//4 	Expand the above so that the message that is displayed 
//varies depending on the number of subjects that they have failed.
