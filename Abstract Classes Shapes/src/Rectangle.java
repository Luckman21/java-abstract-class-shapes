public class Rectangle extends Quadrilateral {
  	
	//Creates an object if there are no parameters
	public Rectangle () {
	}
	
	/**
	 * Calculates the area and perimeter of a rectangle using the length and width.
	 * @param length Input 1 (double)
	 * @param width Input 2 (double)
	 */
  	public Rectangle (double length, double width) {
    	this.area = length * width;
    	this.perimeter = 2 * width + 2 * length;
  	}
 
  	// overwrites the parent method
  	public void printInfo () {
    	super.printInfo();
  	}
}
