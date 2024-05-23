package com.javaBinaryOperators;

public class Example3 {

	public static void main(String[] args) {
		
		int value1 = 200, value2 = 20;
		
		//Logical operators: &&, || and !
		//Note: The Logical operators will generate result in boolean(true/false) type
		
		System.out.println("&&: "+((value1 > value2) && (value1 >= value2)));//true

		System.out.println("||: "+((value1 < value2) || (value1 == value2)));//false
		
		System.out.println("!: "+ !(value1 != value2));//false
		
	}

}
