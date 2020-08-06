import java.util.LinkedList;
import java.util.Scanner;

public class Lab11 {
	static Scanner scnr = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// declare a list of type Human
		LinkedList<movies> movie = new LinkedList<>();
		
		movies m1 = new movies("Lucky number sleven",55);
		movies m2 = new movies("rambo",30);
		movies m3 = new movies("lock stock and two smoaking barrels",100);
		
		// populate our list 
		movie.add(m1);
		movie.add(m2);
		movie.add(m3);
		
		movies tallestPerson = tallestPerson(movie);
		
		// retrieve value from object
		String name = tallestPerson.getName();
		
		System.out.println("movie name:" +name);
		
		
		scnr.close();

	}

	/*
	 * write a method takes in a linked list of Humans returns tallest Human
	 * print their name
	 * 
	 */
	public static movies tallestPerson(LinkedList<movies> movie) {

		// loop through list
		// change max value (int)
		// return that Human instance

		movies first = persons.get(0);
		int max = first.getHeight();

		movies largest = new movies();

		for (movies h : persons) {
			
			//System.out.println(h.getName());

			if (h.getHeight() > max) {
				
				largest = h;
			}

		}
		return largest;
	}

}