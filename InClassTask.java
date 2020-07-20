package com.syntax.class06;

import java.util.Scanner;

public class InClassTask {
	public static void main(String[] args) {
		//Ask user to enter their country and capture it.				
		//Once values are captured print which language user speaks.
		Scanner scan = new Scanner(System.in);	
		System.out.println("Please enter your country:");
		String language = scan.next();		
		switch(language.toLowerCase()) { 
		case "Argentina":
			language = "Argentina";
			break;
		case "Bolivia":
			language = "Spanish";
			break;
		case "Chile":
			language = "Spanish";
			break;
		case "Hong Kong":
			language = "Chinese";
			break;
		case "Taiwan":
			language = "Chinese";
			break;
		case "Malaysia":
			language = "Chinese";
			break;
		case "Australia":
			language = "English";
			break;
		case "Bahamas":
			language = "English";
			break;	
		case "Canada":
			language = "English";
			break;
		case "Burkina Faso":
			language = "French";
			break;
		case "Niger":
			language = "French";
			break;	
		case "Benin":
			language = "French";
			break;
	
			
	
	
	
	
	
	
	}

}
