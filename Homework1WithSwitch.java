package com.syntax.class06;

import java.util.Scanner;

public class Homework1WithSwitch {
	public static void main(String[] args) {
		//Write a program for user to enter his/hers birth month.
		//Based on the month define the season.
		//Example: if user is born in June, July or August →season =”Summer”.
		//At the end of the program we should see output as “You were born ______”.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please your birth month:");
		String month = scan.next();
		
		String season = "Unknown"; 
		
		switch(month.toLowerCase()) { //.toLowerCase() converts December -> december
		case "December":
			season = "Winter";
			break;
		case "January":
			season = "Winter";
			break;
		case "February":
			season = "Winter";
			break;
		case "March":
			season = "Spring";
			break;
		case "April":
			season = "Spring";
			break;
		case "May":
			season = "Spring";
			break;
		case "June":
			season = "Summer";
			break;
		case "July":
			season = "Summer";
			break;	
		case "August":
			season = "Summer";
			break;
		case "September":
			season = "Fall";
			break;
		case "October":
			season = "Fall";
			break;	
		case "November":
			season = "Fall";
			break;	
		}
		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";		
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		}else {
			season = "Unknown";
		};
		
		System.out.println("You were born in " + season);
		
		
	}

}
