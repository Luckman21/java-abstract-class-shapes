public abstract class Shape {
	
		//https://www.codejava.net/java-core/the-java-language/protected-keyword
	  	protected double area;
	  	protected double perimeter;
	  	
	  	protected void printInfo () {
	  		System.out.println ("area = " + this.area + ", perimeter = " + this.perimeter);
	  	}
	}
