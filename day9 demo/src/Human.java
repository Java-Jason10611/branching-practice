
public class Human {

	/*
	 *  instance variables (fields)
	 *  attributes
	 */
	private String name;
	private int age;
	private int height;
	private String faveColor;
	private String eyeColor;

	/*
	 * constructors
	 * 
	 * special method creates objects
	 * needs to be public needs to match class name (exactly)
	 * 
	 */

	public Human(String name, int age, int height, String faveColor, String eyeColor) {

		// this referring to current instance
		// parameter matches field name
		this.name = name;      // Jill
		this.age = age;        // 29
		this.height = height;  // 60
		this.faveColor=faveColor;
		this.eyeColor=eyeColor;
	}

	public Human(String firstName) {

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
		System.out.println("Hi, I'm "+name+".");
	}
	
	/*
	 * SETTERS 
	 * 
	 * sets the object's instance variables(fields)
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(int height) {
		this.height = height;
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
	public int getHeight() {
		return height;
	}
	public String getEyeColor() {
		// java implicitly accesses field
		return eyeColor;
	}
	public String getFaveColor() {
		// java implicitly accesses field
		return faveColor;
	}

	// optional override annotation
	@Override
	public String toString() {

		return String.format("Human[name=%s,age=%d,height=%d,eyeColor=%s,faveColor=%s]", name, age, height, eyeColor,faveColor);
	}

}