package day04_debugging_methods2;

public class DebugDemo {

	public static void main(String[] args) {
		
		// declared and initialized
		int y = 5;
		String greeting = "Hello";
		
		// call our methods by name and provide value of correct type
		increment(y);
		globalize(greeting);
		
		System.out.println("Inside main " + y);
		System.out.println("Inside main " + greeting);
		

	}
	
	private static void increment(int x) {
		
		// logging the value to the console
		System.out.println("Inside increment method (before) " + x);
		
		x++;
		
		System.out.println("Inside increment method (after) " + x);
		
	}
	
	// greeting is a persona, container awaiting a value when called
	private static void globalize(String greeting) {
		
		System.out.println("Inside globalize method (before) " + greeting);
		
		greeting += " World!";
		
		System.out.println("Inside globalize method (after) " + greeting);
		
	}

}