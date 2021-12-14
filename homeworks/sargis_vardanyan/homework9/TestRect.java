package homework9;

/*
  Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named ‘Rectangle’ with a method named ‘Area’ which returns the area and length and breadth passed as parameters to its constructor.
*/

public class TestRect {

	public static void main(String[] args) {
	
		Rectangle rec1 = new Rectangle(0, 0);
		Rectangle rec2 = new Rectangle(10, 5.5);
		Rectangle[] recs = {rec1, rec2};
		
		System.out.println("rec1 area: " + rec1.area());
		System.out.println("rec2 area: " + rec2.area());
		System.out.println("rec1 width = rec2 width: " + rec1.sameWidth(rec2));
		System.out.println("recs objs widths average: " + Rectangle.avgWidth(recs));
	
	}

}

class Rectangle {

	double width;
	double height;
	
	Rectangle() {
		
		width = 0;
		height = 0;
	
	}
	
	Rectangle(double width, double height) {
		
		this.width = width;
		this.height = height;
	
	}
	
	public double area() {
		return width * height;
	}
	
	public boolean sameWidth(Rectangle rec) {
		return this.width == rec.width;
	}
	
	public static double avgWidth(Rectangle[] recs) {
		double result = 0;
		
		for (int i = 0; i < recs.length; i++) {
			result += recs[i].width;
		}
		
		return result / recs.length;
	}

}







