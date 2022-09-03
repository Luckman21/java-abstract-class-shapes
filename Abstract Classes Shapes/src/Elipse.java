public class Elipse extends Shape {
  	protected double axisA, axisB, radius;
  	
  	//Creates an object if there are no parameters
  	public Elipse () {
  	}
 
  	/**
  	 * Takes the A axis and B axis of an elipse and calculates the area and perimeter of the elipse
  	 * @param axisA Input 1 (double)
  	 * @param axisB Input 2 (double)
  	 */
  	public Elipse (double axisA, double axisB) {
    	this.axisA = axisA;
    	this.axisB = axisB;
    	this.area = axisA * axisB * 3.14;
    	this.perimeter = (3.14*(axisA+axisB))*(3*((axisA-axisB)*(axisA-axisB)/((axisA+axisB)*(axisA+axisB)*(Math.pow((-3*(((axisA-axisB)*(axisA-axisB))/((axisA+axisB)*(axisA+axisB)))+4),0.5)+10)))+1);
  	}
 
  	// overwrites the parent method
  	public void printInfo () {
    	//System.out.println ("The width of this rectangle is = " +this.width);
    	//System.out.println ("The height of this rectangle is = " +this.height);
    	super.printInfo();
  	}
}