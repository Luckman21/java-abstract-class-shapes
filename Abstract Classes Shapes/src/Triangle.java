public class Triangle extends Shape {
  	protected double base, height, side1, side2;
  	
  	//Creates an object if there are no parameters
  	public Triangle () {
  	}
 
  	/**
  	 * Calculates the area and perimeter of a triangle using the side lengths and the height of the triangle.
  	 * @param base Input 1 (double)
  	 * @param side1 Input 2 (double)
  	 * @param side2 Input 3 (double)
  	 * @param height Input 4 (double)
  	 */
  	public Triangle (double base, double side1, double side2, double height) {
  		this.area = (base*height)/2;
    	this.perimeter = base+side1+side2;
  	}
 
  	// overwrites the parent method
  	public void printInfo () {
    	//System.out.println ("The width of this Triangle is = " +this.base);
    	//System.out.println ("The height of this Triangle is = " +this.height);
    	super.printInfo();
  	}
}