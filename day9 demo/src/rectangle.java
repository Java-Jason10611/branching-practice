
public class rectangle {

	    private double width;
	    private double height;
	
		public rectangle(double w, double h){
		     width = w;
		     height = h;
		}


		public double calArea() {
	        return width * height;
	    }

	    public double calPerimiter() {
	        return 2*width+2*height;
	    }


	    	public double getWidth(){
	    	   return width;
	    	}
}
