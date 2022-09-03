public class Quadrilateral extends Shape {
	protected double width, height, side1, side2, side3, side4, base1, base2;
	protected boolean real = true;
  	
	//Creates an object if there are no parameters
  	public Quadrilateral () {
  	}
  	
  	/**
  	 * Takes all 4 sides of an unknown quadrilateral and checks if the shape can exist.
  	 * If the shape can exist, it calculates the perimeter.  
  	 * Area cannot be calculated because the shape of the quadrilateral changes the area and its calculation.
  	 * @param side1 Input 1 (double)
  	 * @param side2 Input 2 (double)
  	 * @param side3 Input 3 (double)
  	 * @param side4 Input 4 (double)
  	 */
  	public Quadrilateral (double side1, double side2, double side3, double side4) {
  		this.side1 = side1;
  		this.side2 = side2;
  		this.side3 = side3;
  		this.side4 = side4;
  		this.area = -1;
  		
  		double[] sides = {this.side1,this.side2,this.side3,this.side4};  		
  		
  		for (int i= 0; i < 4; i++) {
  			if (sides[i] >= this.side1+this.side2+this.side3+this.side4 - sides[i]){
  	  			this.perimeter = -1;
  	  			real = false;
  			}
  		}
  		if (real == true) {
  			this.perimeter = side1+side2+side3+side4;
  		}
  	}
 
  	// overwrites the parent method
  	public void printInfo () {
    	//System.out.println ("The width of this rectangle is = " +this.width);
    	//System.out.println ("The height of this rectangle is = " +this.height);
    	super.printInfo();
  	}
}
