
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionsDemo {

	public static void main(String[] args) {

		/*
		 * compile time checked exception
		 * 
		 */

		// invalid date format
		String dateString = "01/282021";

		try {

			// parse method used to create Date object from String
			Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateString);

			// your exception must be declared here
		} catch (ParseException pe) {

			// when exception occurs
			// enter the catch block
			System.out.println("Invalid date...");

			// pe.printStackTrace();

		} finally {

			// whether exception is thrown OR not
			// execute this code
			// close things that should be closed
			System.out.println("You made it!");
		}

		// do more stuff

		try {

			String numberFromString = "0";

			int number = Integer.parseInt(numberFromString);

			int answer = 10 / number;

		} catch (NumberFormatException nfe) {

			System.out.println("That is not a number.");
			nfe.printStackTrace();

		} catch (ArithmeticException e) {

			System.out.println("Cannot divide by zero.");

		} catch (Exception e) {
			
			// parent exception that handles all types
			
			System.out.println("Something went REALLY wrong.");
			
		}

	}

}