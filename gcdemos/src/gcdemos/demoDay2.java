package gcdemos;

import java.util.Scanner;

public class demoDay2 {

	public static void main(String[] args) 
	{
		System.out.println("what letter grade did you get?");
		Scanner letterGrade = new Scanner(System.in);	
		 String grade = letterGrade.next();
//		 System.out.println(grade);
		switch(grade) {
		case "A" :
			System.out.println("Your grade was between 90%-100%");
			break;
		case "B" :
			System.out.println("Your grade was between 80%-89%");
			break;
		case "C" :
			System.out.println("Your grade was between 70%-79%");
			break;
		case "D" :
			System.out.println("Your grade was between 60%-69%");
			break;
		case "E" :
			System.out.println("Your grade was bellow 60%");
			break;
		}
		
		
	
	
	
	}

}
