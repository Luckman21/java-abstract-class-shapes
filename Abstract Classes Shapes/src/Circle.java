public class Circle extends Elipse{

	//Creates an object if there are no parameters
	public Circle () {
	}
	
	/**
	 * Takes in the radius of the circle to calculate area and perimeter.
	 * @param radius Input 1 (double)
	 */
	public Circle (double radius) {
		this.area = (3.14)*Math.pow(radius,2);
		this.perimeter = 2*(3.14)*radius;
	}
	//overwrites the parent method
	public void printInfo () {
    	super.printInfo();
  	}
}
