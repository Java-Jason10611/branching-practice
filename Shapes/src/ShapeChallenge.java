import java.util.ArrayList;

public class ShapeChallenge {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		circle circle1 = new circle(2.5);
		circle circle2 = new circle(3.5);
		Rectangle rectangle1 = new Rectangle(12, 5);
		Rectangle rectangle2 = new Rectangle(5, 17);
		shapes.add(circle1);
		shapes.add(circle2);
		shapes.add(rectangle1);
		shapes.add(rectangle2);
		
		Shape max = shapes.get(0);
		for(int i=0; i< shapes.size();i++){
			double area =shapes.get(i).calcArea();
			
			if(area>max.calcArea()) {
				
				max=shapes.get(i);
				
				
			}
		}
	System.out.println(max.calcArea());
	
	}

}
