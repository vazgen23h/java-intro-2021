import java.util.Scanner;

class Reqtangle {
    int breadth;
    int length;

    int area(int length, int breadth) {
        return length * breadth;
    }

    void getLength(int length) {
        this.length = length;
    }

    void getBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Reqtangle reqtangle = new Reqtangle();
        System.out.println("Input rectangle's breadth");
        reqtangle.breadth = scan.nextInt();
        System.out.println("Input rectangle's length");
        reqtangle.length = scan.nextInt();
        System.out.println("Rectangle's area = "+reqtangle.area(reqtangle.length, reqtangle.breadth));
    }
}