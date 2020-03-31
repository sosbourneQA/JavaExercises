package com.qa.main;

public class TaxCalculator {

	public void printName (String name) {
       System.out.println("this is the user name: " + name);		
	}
	
	
	public void printSalary (Double amount) {
		System.out.println("this is the annualy salary: " + amount);
		
		System.out.println("this is the monthly salary: " + (amount/12));
		
		System.out.println("this is the daily salary: " + (amount/365));
	}
	
	
	public void calculator (double amount) {
		
		if (amount < 21000) {
			System.out.println("you are paying 10% tax: " + (amount * 0.1));
		}
		else if (amount < 32500) {
			System.out.println("you are paying 20% tax: " + (amount * 0.2));
		}
		else {
			System.out.println("you are paying 40% tax: " + (amount * 0.4));
		}
		
	}
	
	
}



//have a method that works out the tax a user pays - 
//10% tax if earning less than 21000, 20% if paying between 21000 and 32500, 
//and 40% tax if earning more than 32500