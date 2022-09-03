public class DimensionsCalc {
	public static void main(String args[]) {
/*
 * OBJECTS
 */
		
//Quadrilaterals
		Quadrilateral a1 = new Square (2);
		Quadrilateral a2 = new Rectangle (5,2);
		Quadrilateral a3 = new Rhombus (3,4,5);
		Quadrilateral a4 = new Quadrilateral (4,8,5,3);
		Quadrilateral a5 = new Trapezoid (4,4,3,2,1);
		
//Triangles
		Triangle b1 = new RightTriangle (5,2);
		Triangle b2 = new Triangle (3,4,6,3);
		
//Elipses
		Elipse c1 = new Circle (1);
		Elipse c2 = new Elipse (2,3);
		
/*
 * PRINT STATEMENTS
 */
		
//Quadrilaterals
		System.out.println("Quadrilaterals:\n");
		System.out.print("\tSquare: ");
		a1.printInfo();
		System.out.print("\tRectangle: ");
		a2.printInfo();
		System.out.print("\tRhombus: ");
		a3.printInfo();
		System.out.print("\tUnknown Quadrilateral: ");
		a4.printInfo();
		System.out.print("\tTrapezoid: ");
		a5.printInfo();
		
//Triangles
		System.out.println("\nTriangles:\n");
		System.out.print("\tRight Angle Triangle: ");
		b1.printInfo();
		System.out.print("\tUnknown Triangle: ");
		b2.printInfo();
		
//Elipses
		System.out.println("\nElipses:\n");
		System.out.print("\tCircle: ");
		c1.printInfo();
		System.out.print("\tUnknown Elipse: ");
		c2.printInfo();
	}
}
