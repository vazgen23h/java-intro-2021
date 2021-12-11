public class Rectangle{
	public static void main(String[] args){
        Area obj1  = new Area(4,5);
       Area obj2  = new Area(5,8);

        System.out.println(obj1.area());
        }
        }
        class Area{
	int length;
	int breadth;
 
 Area(int length, int breadth){
 	this.length = length;
 	this.breadth = breadth;

}
 public int area(){
 	return length * breadth;
 }

}
