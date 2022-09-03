public class RightTriangle extends Triangle {

	//Creates an object if there are no parameters
	public RightTriangle() {
	}
	
	/**
	 * Calculates the area and perimeter of a right angle triangle using the base and the height of the triangle.
	 * @param base Input 1 (double)
	 * @param height Input 2 (double)
	 */
	public RightTriangle (double base, double height) {
  		this.base = base;
    	this.height = height;
    	this.area = (base * height)/2;
    	
    	//Pythagorean theorem done to find the last side length
    	side1 = Math.pow(((base*base)+(height*height)), 0.5);
    	
    	this.perimeter = side1+base+height;
  	}
	
	//overwrites parent method
	public void printInfo () {
    	super.printInfo();
  	}
	
}
