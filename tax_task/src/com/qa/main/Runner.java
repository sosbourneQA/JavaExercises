package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "nick";
		Double salary = 23500.0; 
		Double pension = 80000.0;
		
		TaxCalculator calc = new TaxCalculator();
        
		calc.printName(user);
		calc.printSalary(salary);
		calc.calculator(pension);
		
	}

}
