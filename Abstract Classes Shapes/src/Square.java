public class Square extends Quadrilateral {
  	
	//Creates an object if there are no parameters
	public Square () {
	}
	
	/**
	 * Calculates the area and perimeter of a square using the width measurement.
	 * @param width Input 1 (double)
	 */
  	public Square (double width) {
    	this.area = width * width;
    	this.perimeter = 4 * width;
  	}
 
  	// overwrites the parent method
  	public void printInfo () {
    	super.printInfo();
  	}
}
