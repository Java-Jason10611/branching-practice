package gcdemos;
import java.util.Scanner;
import java.util.*;

public class MilageExercise {

	public static void main(String[] args) {	
//		int mpg = 0;
//		int gallonsInTank= 0;
//		int milesTillE = 0;
//		
		System.out.println("Enter cars average mpg?");
		Scanner mpgs = new Scanner(System.in);
		int carsMpg = mpgs.nextInt();
		System.out.println("gallons left in tank?");
		Scanner gallons = new Scanner(System.in);
		int gallonsInTank= gallons.nextInt();
//		int gallons=0;
//		int carsMpg = mpg;
//		int gasLeft = gallons.nextInt();
		int milesTillEmpty = carsMpg * gallonsInTank;
		System.out.println("you have about " + milesTillEmpty + " miles till you're empty");
		
	}

}
