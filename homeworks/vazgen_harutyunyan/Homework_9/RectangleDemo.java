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
    int getLength() {
        return length;
    }
    int getBreadth() {
        return breadth;
    }
}
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectang1 = new Rectangle(4, 5);
        System.out.println(rectang1.area());
        Rectangle rectang2 = new Rectangle(5, 8);
        System.out.println(rectang2.area());

    }
}