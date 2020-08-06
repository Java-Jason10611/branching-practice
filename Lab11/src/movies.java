
public class movies {

	/*
	 * instance variables (fields) attributes
	 */
	private String name;
	
	private String eyeColor;

	/*
	 * constructors
	 * 
	 * special method creates objects needs to be public needs to match class name
	 * (exactly)
	 * 
	 */
	public movies(String name,  String genre) {

		personCount++;

		// this referring to current instance
		// parameter matches field name
		this.name = name; // Jill
		
		this.eyeColor = eyeColor; // Hazel
	}

	public movies(String name, String genre) {

		personCount++;

		this.name = name; // Jill
		

	}

	public movies() {
		personCount++;

	}

	public movies(String firstName) {

		personCount++;

		// storing value passed into constructor
		// in the instance variable
		// java implicitly does assigns value
		name = firstName;
	}

	/*
	 * instance methods (non-static)
	 * 
	 * functions/actions
	 */
	public void greeting() {
		System.out.println("Hi, I'm " + name + ".");
	}

	/*
	 * SETTERS
	 * 
	 * sets the object's instance variables(fields)
	 */

	

	public void setName(String name) {
		this.name = name;
	}

	

	public void setEyeColor(String color) {
		this.eyeColor = color;
	}

	/*
	 * GETTER
	 * 
	 * gets and returns an object's field value
	 */
	public String getName() {
		// java implicitly accesses field
		return name;
	}

	

	public String getEyeColor() {
		return eyeColor;
	}

	/*
	 * static variables/methods
	 * 
	 * universal information/functions not specific to any one instance
	 */

	// class variables
	private static int personCount = 0;

	// class methods
	public static int getPersonCount() {

		return personCount;
	}

	public static void printNumberOfHumans() {

		System.out.println("There are now " + getPersonCount() + " Humans.");

	}

	// optional override annotation
	// custom implementation of Object.toString()
	@Override
	public String toString() {

		return String.format("Human[name=%s,age=%d,height=%d,eyeColor=%s]", name, age, height, eyeColor);
	}

}
