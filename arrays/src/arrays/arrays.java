package arrays;

public class arrays {

	public static void main(String[] args) {


		String[] color = new String[3];

		color[0] = "Red";
		color[1] = "Green";
		color[2] = "Blue";
	


		String lastColor = color[color.length - 2];

		
		System.out.println("Third color " + lastColor);

		color[1] = ("White");

		for (int index = 0; index < color.length; index++) {

			System.out.println("Color: " + color[index]);


		}

	}

}


