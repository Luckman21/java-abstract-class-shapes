public class Trapezoid extends Quadrilateral {
  	
	//Creates an object if there are no parameters
	public Trapezoid () {
	}
	
	/**
	 * Checks to see if each side length is less than the sum of the other side lengths (if not, the shape cannot exist).
	 * If the Trapezoid is possible, it will calculate the area and perimeter.
	 * @param base1 Input 1 (double)
	 * @param base2 Input 2 (double)
	 * @param side1 Input 3 (double)
	 * @param side2 Input 4 (double)
	 * @param height Input 5 (double)
	 */
  	public Trapezoid (double base1, double base2, double side1, double side2, double height) {
  		
  		double[] sides = {base1,base2,side1,side2};  		
  		
  		for (int i= 0; i < 4; i++) {
  			if (sides[i] >= base1+base2+side1+side2 - sides[i]){
  	  			this.perimeter = -1;
  	  			this.area = -1;
  	  			real = false;
  			}
  		}
  		if (real == true) {
  			this.area = ((base1+base2)*height)/2;
  	    	this.perimeter = side1 + side2 + base1 + base2;
  		}
  	}
 
  	// overwrites the parent method
  	public void printInfo () {
    	super.printInfo();
  	}
}
