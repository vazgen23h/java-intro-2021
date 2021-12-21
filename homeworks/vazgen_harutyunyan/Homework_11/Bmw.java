public class Bmw {
    String model;
    static int produced=0;

    Bmw(String model){
    	this.model=model;
    }

    static int producedCars() {
    	produced++;
    	return produced;
    }
    
    void print(){
    	System.out.println(model);
    }
}