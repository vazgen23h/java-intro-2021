public class Task1 {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 5);
		Rectangle rectangle2 = new Rectangle(5, 8);
		System.out.println("The are of first rectangle = " + rectangle1.area() + " length = " + rectangle1.length() + " breadth = " + rectangle1.breadth());
		System.out.print("The are of second rectangle = " + rectangle2.area() + " length = " + rectangle2.length() + " breadth = " + rectangle2.breadth());
	}
}

class Rectangle {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	int area() {
		return length * breadth; 
	}
	int length() {
		return length;
	}
	int breadth() {
		return breadth;
	}
}