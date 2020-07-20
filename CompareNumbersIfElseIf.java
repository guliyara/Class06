package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersIfElseIf {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the first number");
	double a = scan.nextDouble();
	
	System.out.println("Please enter the second number");
	double b = scan.nextDouble();
	
	System.out.println("Please enter the third number");
	double c = scan.nextDouble();
	
	
	double largest = 0;
	
	if (a >b && a > c) {
		largest = a;
		System.out.println("Largest number is" + a);
	}else if (b > a && b > c) {
		largest = b;
		System.out.println("Largest number is" + b);
	}else if (c > a && c > b) {
		largest = c;
		System.out.println("Largest number is" + c);
	}
	
	//2nd way
	if (a>b && a>c) {
		//a is the largest
		largest=a;
	}else if (a>b) { // a is not the largest, iam comparing b and c
		// b is the largest
		largest=b;
	}else { // a is not the largest, b is n ot the largest,
		//c is the largest
		largest=c;
	}
	
	System.out.println("Largets number is " + largest);
	
	
	
	
	
	
	
	
	
	
}
}
