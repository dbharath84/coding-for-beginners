package com.citi.demo.day2;

public class ArrayDemo {

	public static void main(String[] args) {
		
//		int maths = 99;
//		int physics = 98;
//		int chemistry = 97;
//		int english = 96;
//		int tamil = 95;
		
		//instead of declaring each variable, we can use the below array and its elements
		
		int[] marks = { 99, 98, 97, 96, 95 };		//elements
//		System.out.println(marks); 			//This command will not work for Array
		System.out.println("Chemistry");
		System.out.println(marks[2]);		//Always index starts with 0 position, so picks the 2nd position from array
		System.out.println("Maths");
		System.out.println(marks[4]);
		System.out.println("All Subjects");
		
		for ( int i = 0; i < 5; i++) {
			System.out.println(marks[i]);
		}
				
	}
	
}
