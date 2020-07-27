package gcdemos;

public class MethodExercise {

	public static void main(String[] args) {
		Print123();
		add(12 , 3.14);
		System.out.println(firstChar("hello"));
	}
	public static void Print123() {
		System.out.println("One, Two, Three");
		
	}
	public static void add(double i, double n){
		System.out.println(i+n);
		}

	public static String firstChar(String word) {
		String firstLetter = word.substring(0, 1);
		return firstLetter;
	
	}

}