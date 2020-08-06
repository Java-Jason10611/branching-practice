import java.util.Scanner;
public class ShapesApp {
	
	


		public static void main(String[] args) {
			rectangle R1=new rectangle(30.0, 40.0);
			Scanner scnr = new Scanner(System.in);

			double input = Validator.getDouble(scnr, "Enter a radius: ");

			rectangle r1 = new rectangle(input);

			double area = r1.calArea();
			// double circumference = c1.calcCircumference();

			System.out.printf("Area of circle: %.4f\n", area);
			System.out.printf("perimiter of circle: %.4f\n", r1.calPerimiter());
			
			
			
			

			scnr.close();

		}

	}
}
