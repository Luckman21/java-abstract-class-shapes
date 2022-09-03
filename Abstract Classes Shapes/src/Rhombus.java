public class Rhombus extends Quadrilateral {
  	
	//Creates an object if there are no parameters
	public Rhombus () {
	}
	
	/**
	 * Takes in the parameters of the base and side to calculate area and uses base and height to calculate the area for the rhombus.
	 * @param base Input 1 (double)
	 * @param side Input 2 (double)
	 * @param height Input 3 (double)
	 */
  	public Rhombus (double base, double side, double height) {
    	this.area = base * height;
    	this.perimeter = base*2 + side*2;
  	}
 
  	// overwrites the parent method
  	public void printInfo () {
    	super.printInfo();
  	}
}