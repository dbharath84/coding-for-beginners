package com.citi.demo.day3;

//DRY - Don't repeat yourself. 

public class MethodDemo {

	static void calculateIncome(double salary, double bonus, double tax) {
		double income = salary + bonus - tax;
		System.out.println(income);
	}

	public static void main(String[] args) {

//		double salary = 100;
//		double bonus = 10;
//		double tax = 5;
//		double income = salary + bonus - tax;
//		System.out.println(income);
//
//		double salary2 = 150;
//		double bonus2 = 20;
//		double tax2 = 10;
//		double income2 = salary2 + bonus2 - tax2;
//		System.out.println(income2);
		
		MethodDemo.calculateIncome(100, 10, 5);
		MethodDemo.calculateIncome(150, 20, 10);
		MethodDemo.calculateIncome(90, 5, 0);

	}

}
