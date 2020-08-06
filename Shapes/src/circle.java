
public class circle implements Shape {
	private double radius;

	public circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void printDetails() {

	}

}
