import java.util.Scanner;

public class ObjectsDemo {
	
	
	public static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		// create an instance (instantiate) of the Human class
		Human person1 = new Human("Will");
		Human person2 = new Human("Jill", 29, 60,"Black","Purple");
		Human person3 = new Human("David", 27, 56,"red","Blue");
		Human person4 = new Human("Kevin", 33, 59,"Black","green" );
		// set value of instance variable 
		person1.setAge(40);
		
		// get value of instance variable
		int height = person2.getHeight();
		String eyeColor= person4.getEyeColor();
		String faveColor= person4.getFaveColor();
		// must access method with an instance of the class
		person4.greeting();
		person3.greeting();
	
		

		System.out.println(person4);

	}

}