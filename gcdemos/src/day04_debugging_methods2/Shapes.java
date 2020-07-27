
package day04_debugging_methods2;

// custom class
public class Shapes {
	
	/*
	 * utility class with static methods
	 * 
	 * calculate AREA & PERIMETER (Circumference) of Shapes
	 * 
	 */
	
	
	
	public static double calculateCircleArea(double radius) {
		
		// Pi * (rad * rad)
		// use our private square method below
		
		return Math.PI * square(radius);
		
	}
	
	private static double square(double num) {
		
		return num*num;
		
	}
	public static double rectanglePermiter(double num1, double num2) {
//		double num1=0;
//		double num2=0;
		return((num1 + num2)*2);
	}
	public static double circleCircumfrence(double radius) {
		
		double circumfrence = 2 * Math.PI * radius;
		
		return(circumfrence);
	}
	

}