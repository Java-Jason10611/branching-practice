
public class Rectangle implements Shape{
	
	private double length;
	private double width;
	
	
	
	public Rectangle(double len, double wid) {
		this.length=len;
		this.width=wid;
	}



	@Override
	public double calcArea() {
		return length * width;
	}



	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
	}




		
	}

