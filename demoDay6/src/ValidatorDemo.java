import java.util.Scanner;

public class ValidatorDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scnr.nextLine();
		int age = Validator.getPositiveInt(scnr, "Enter your age: ");
		int favNum = Validator.getInt(scnr, "Enter your favorite number: ");
		boolean getYesNo= Validator.getYesNo(scnr,"do you want to continue");
		for (int i = 1; i <= age; i++) {
			System.out.println(name + " turns " + i);
		}

		scnr.close();
	}
	
	

}